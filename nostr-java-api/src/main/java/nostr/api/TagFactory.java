/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nostr.api;

import nostr.base.ITag;

/**
 *
 * @author eric
 * @param <T>
 */
public abstract class TagFactory<T extends ITag> {

    public abstract T create();
}
