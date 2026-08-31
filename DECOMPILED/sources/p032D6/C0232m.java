package p032D6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0156e;
import p024C6.InterfaceC0157f;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0232m implements InterfaceC7616b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7616b f955a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0096d f956b;

    public C0232m(InterfaceC7616b serializer) {
        AbstractC6118n.m27187e(serializer, "serializer");
        this.f955a = serializer;
        this.f956b = new C0243x(serializer.mo1120a());
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return this.f956b;
    }

    @Override // p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: b */
    public Object mo1109b(InterfaceC0156e decoder) {
        AbstractC6118n.m27187e(decoder, "decoder");
        return decoder.mo728n() ? decoder.mo696g(this.f955a) : decoder.mo727j();
    }

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public void mo1121d(InterfaceC0157f encoder, Object obj) {
        AbstractC6118n.m27187e(encoder, "encoder");
        if (obj == null) {
            encoder.mo731c();
        } else {
            encoder.mo709k();
            encoder.mo713p(this.f955a, obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0232m.class == obj.getClass() && AbstractC6118n.m27183a(this.f955a, ((C0232m) obj).f955a);
    }

    public int hashCode() {
        return this.f955a.hashCode();
    }
}
