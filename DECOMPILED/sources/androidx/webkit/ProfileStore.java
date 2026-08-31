package androidx.webkit;

import java.util.List;
import p098M0.InterfaceC0872b;
import p105N0.AbstractC0928p;
import p105N0.C0922j;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (AbstractC0928p.f3601d0.mo4147d()) {
            return C0922j.getInstance();
        }
        throw AbstractC0928p.m4158a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    InterfaceC0872b getOrCreateProfile(String str);

    InterfaceC0872b getProfile(String str);
}
