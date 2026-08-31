package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0229j implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    public static final C0229j f947a = new C0229j();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0096d f948b = new C0242w("kotlin.Long", AbstractC0095c.d.f520a);

    private C0229j() {
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return f948b;
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo1121d(InterfaceC0157f interfaceC0157f, Object obj) {
        m1145g(interfaceC0157f, ((Number) obj).longValue());
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return Long.valueOf(decoder.mo701m());
    }

    /* JADX INFO: renamed from: g */
    public void m1145g(InterfaceC0157f encoder, long j7) {
        AbstractC6118n.m27187e(encoder, "encoder");
        encoder.mo714q(j7);
    }
}
