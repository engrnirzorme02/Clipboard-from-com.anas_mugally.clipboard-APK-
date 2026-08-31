package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0223d implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    public static final C0223d f936a = new C0223d();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0096d f937b = new C0242w("kotlin.Double", AbstractC0095c.b.f518a);

    private C0223d() {
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return f937b;
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo1121d(InterfaceC0157f interfaceC0157f, Object obj) {
        m1126g(interfaceC0157f, ((Number) obj).doubleValue());
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return Double.valueOf(decoder.mo729r());
    }

    /* JADX INFO: renamed from: g */
    public void m1126g(InterfaceC0157f encoder, double d7) {
        AbstractC6118n.m27187e(encoder, "encoder");
        encoder.mo732f(d7);
    }
}
