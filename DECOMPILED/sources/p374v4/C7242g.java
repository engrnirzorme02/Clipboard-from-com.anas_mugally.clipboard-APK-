package p374v4;

import p164V3.C1762g;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: loaded from: classes.dex */
public class C7242g extends AbstractC7241f {
    /* JADX INFO: renamed from: H */
    public void m31984H(InterfaceC7261z interfaceC7261z) {
        this.f28856d = interfaceC7261z;
    }

    /* JADX INFO: renamed from: I */
    public void m31985I(InterfaceC7261z interfaceC7261z) {
        this.f28855c = interfaceC7261z;
    }

    /* JADX INFO: renamed from: J */
    public synchronized void m31986J(C1762g c1762g) {
        this.f28864l = c1762g;
    }

    /* JADX INFO: renamed from: K */
    public synchronized void m31987K(String str) {
        m31966b();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f28858f = str;
    }
}
