package p301m5;

import p102M4.InterfaceC0901f;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: m5.u */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6393u implements InterfaceC0901f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ InterfaceC2059a f24419r = AbstractC2060b.m8524a(m27509c());

    /* JADX INFO: renamed from: a */
    private final int f24420a;

    EnumC6393u(int i7) {
        this.f24420a = i7;
    }

    @Override // p102M4.InterfaceC0901f
    /* JADX INFO: renamed from: a */
    public int mo4100a() {
        return this.f24420a;
    }
}
