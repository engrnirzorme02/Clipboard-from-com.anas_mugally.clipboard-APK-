package p032D6;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p145S5.C1426d;

/* JADX INFO: renamed from: D6.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0242w implements InterfaceC0096d {

    /* JADX INFO: renamed from: a */
    private final String f975a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0095c f976b;

    public C0242w(String serialName, AbstractC0095c kind) {
        AbstractC6118n.m27187e(serialName, "serialName");
        AbstractC6118n.m27187e(kind, "kind");
        this.f975a = serialName;
        this.f976b = kind;
    }

    /* JADX INFO: renamed from: b */
    private final Void m1167b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: a */
    public String mo371a() {
        return this.f975a;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: c */
    public boolean mo372c() {
        return InterfaceC0096d.a.m382c(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: d */
    public int mo373d(String name) {
        AbstractC6118n.m27187e(name, "name");
        m1167b();
        throw new C1426d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0242w)) {
            return false;
        }
        C0242w c0242w = (C0242w) obj;
        return AbstractC6118n.m27183a(mo371a(), c0242w.mo371a()) && AbstractC6118n.m27183a(mo374e(), c0242w.mo374e());
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: f */
    public int mo375f() {
        return 0;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: g */
    public String mo376g(int i7) {
        m1167b();
        throw new C1426d();
    }

    @Override // p016B6.InterfaceC0096d
    public List getAnnotations() {
        return InterfaceC0096d.a.m380a(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: h */
    public List mo377h(int i7) {
        m1167b();
        throw new C1426d();
    }

    public int hashCode() {
        return mo371a().hashCode() + (mo374e().hashCode() * 31);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: i */
    public InterfaceC0096d mo378i(int i7) {
        m1167b();
        throw new C1426d();
    }

    @Override // p016B6.InterfaceC0096d
    public boolean isInline() {
        return InterfaceC0096d.a.m381b(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: j */
    public boolean mo379j(int i7) {
        m1167b();
        throw new C1426d();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC0095c mo374e() {
        return this.f976b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo371a() + ')';
    }
}
