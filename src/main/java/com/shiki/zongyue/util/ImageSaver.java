package com.shiki.zongyue.util;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.security.NoSuchAlgorithmException;

public class ImageSaver {


    public static String uploadImageSave(String path, int authorId, MultipartFile multipartFile) {
        File imageFolder = new File(path);
        String imageName = null;
        imageName = ImageNameCreater.imageNameGetter(authorId);
        saveImage(path, multipartFile, imageName);
        return imageName;
    }

    public static void saveImage(String path, MultipartFile multipartFile, String imageName) {

        File imageFolder = new File(path);
        File file = new File(imageFolder, imageName + ".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedImage bufferedImage = imageMix(multipartFile);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            ImageIO.write(bufferedImage, "jpg", bufferedOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage imageMix(MultipartFile multipartFile) {
        BufferedImage bufferedImage = new BufferedImage(144, 184, BufferedImage.TYPE_INT_RGB);
        try {
            bufferedImage.getGraphics().drawImage(ImageIO.read(multipartFile.getInputStream()), 0, 0, 144, 184, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }


}
