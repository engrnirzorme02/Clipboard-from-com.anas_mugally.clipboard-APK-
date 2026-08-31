package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0245z implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    public static final C0245z f980a = new C0245z();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0096d f981b = new C0242w("kotlin.String", AbstractC0095c.e.f521a);

    private C0245z() {
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return f981b;
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return decoder.mo700l();
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1121d(InterfaceC0157f encoder, String value) {
        AbstractC6118n.m27187e(encoder, "encoder");
        AbstractC6118n.m27187e(value, "value");
        encoder.mo715r(value);
    }
}
