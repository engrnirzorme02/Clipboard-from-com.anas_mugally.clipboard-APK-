package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0226g implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    public static final C0226g f944a = new C0226g();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0096d f945b = new C0242w("kotlin.Int", AbstractC0095c.c.f519a);

    private C0226g() {
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return f945b;
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo1121d(InterfaceC0157f interfaceC0157f, Object obj) {
        m1136g(interfaceC0157f, ((Number) obj).intValue());
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return Integer.valueOf(decoder.mo698i());
    }

    /* JADX INFO: renamed from: g */
    public void m1136g(InterfaceC0157f encoder, int i7) {
        AbstractC6118n.m27187e(encoder, "encoder");
        encoder.mo712o(i7);
    }
}
