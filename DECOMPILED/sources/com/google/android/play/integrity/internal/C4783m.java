package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C4783m implements InterfaceC4782l {

    /* JADX INFO: renamed from: b */
    private static final C4783m f18400b = new C4783m(null);

    /* JADX INFO: renamed from: a */
    private final Object f18401a;

    private C4783m(Object obj) {
        this.f18401a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC4782l m21928b(Object obj) {
        if (obj != null) {
            return new C4783m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4785o
    /* JADX INFO: renamed from: a */
    public final Object mo21830a() {
        return this.f18401a;
    }
}
