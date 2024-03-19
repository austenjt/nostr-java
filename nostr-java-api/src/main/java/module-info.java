/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module nostr.api {
    requires nostr.base;
    requires nostr.util;
    requires nostr.event;
    requires nostr.id;
    requires nostr.client;
    requires nostr.encryption;
    requires nostr.encryption.nip04dm;
    requires nostr.encryption.nip44dm;
    
    requires com.fasterxml.jackson.databind;
    
    requires lombok;
    requires java.logging;

    exports nostr.api;
}