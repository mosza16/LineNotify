/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justdo.line.linenotify;

/**
 *
 * @author mosza16
 */
public class LineParameter {
    String message;
    int stickerPackageId;
    int stickerId ;

    public LineParameter(String message) {
        this.message = message;
    }
    
    public LineParameter(String message, int stickerPackageId, int stickerId) {
        this.message = message;
        this.stickerPackageId = stickerPackageId;
        this.stickerId = stickerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStickerPackageId() {
        return stickerPackageId;
    }

    public void setStickerPackageId(int stickerPackageId) {
        this.stickerPackageId = stickerPackageId;
    }

    public int getStickerId() {
        return stickerId;
    }

    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
    }
    
    
}
