package p301m5;

import p102M4.InterfaceC0901f;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: m5.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6376d implements InterfaceC0901f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ InterfaceC2059a f24379t = AbstractC2060b.m8524a(m27489c());

    /* JADX INFO: renamed from: a */
    private final int f24380a;

    EnumC6376d(int i7) {
        this.f24380a = i7;
    }

    @Override // p102M4.InterfaceC0901f
    /* JADX INFO: renamed from: a */
    public int mo4100a() {
        return this.f24380a;
    }
}
