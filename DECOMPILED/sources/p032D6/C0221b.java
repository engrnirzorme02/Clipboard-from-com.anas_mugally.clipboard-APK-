package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0221b implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    public static final C0221b f934a = new C0221b();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0096d f935b = new C0242w("kotlin.Boolean", AbstractC0095c.a.f517a);

    private C0221b() {
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return f935b;
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo1121d(InterfaceC0157f interfaceC0157f, Object obj) {
        m1123g(interfaceC0157f, ((Boolean) obj).booleanValue());
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return Boolean.valueOf(decoder.mo726c());
    }

    /* JADX INFO: renamed from: g */
    public void m1123g(InterfaceC0157f encoder, boolean z7) {
        AbstractC6118n.m27187e(encoder, "encoder");
        encoder.mo733h(z7);
    }
}
