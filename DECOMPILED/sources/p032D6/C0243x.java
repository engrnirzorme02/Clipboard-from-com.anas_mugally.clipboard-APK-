package p032D6;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.InterfaceC0096d;

/* JADX INFO: renamed from: D6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0243x implements InterfaceC0096d, InterfaceC0222c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0096d f977a;

    /* JADX INFO: renamed from: b */
    private final String f978b;

    /* JADX INFO: renamed from: c */
    private final Set f979c;

    public C0243x(InterfaceC0096d original) {
        AbstractC6118n.m27187e(original, "original");
        this.f977a = original;
        this.f978b = original.mo371a() + '?';
        this.f979c = AbstractC0233n.m1150a(original);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: a */
    public String mo371a() {
        return this.f978b;
    }

    @Override // p032D6.InterfaceC0222c
    /* JADX INFO: renamed from: b */
    public Set mo1124b() {
        return this.f979c;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: c */
    public boolean mo372c() {
        return true;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: d */
    public int mo373d(String name) {
        AbstractC6118n.m27187e(name, "name");
        return this.f977a.mo373d(name);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: e */
    public AbstractC0098f mo374e() {
        return this.f977a.mo374e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0243x) && AbstractC6118n.m27183a(this.f977a, ((C0243x) obj).f977a);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: f */
    public int mo375f() {
        return this.f977a.mo375f();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: g */
    public String mo376g(int i7) {
        return this.f977a.mo376g(i7);
    }

    @Override // p016B6.InterfaceC0096d
    public List getAnnotations() {
        return this.f977a.getAnnotations();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: h */
    public List mo377h(int i7) {
        return this.f977a.mo377h(i7);
    }

    public int hashCode() {
        return this.f977a.hashCode() * 31;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: i */
    public InterfaceC0096d mo378i(int i7) {
        return this.f977a.mo378i(i7);
    }

    @Override // p016B6.InterfaceC0096d
    public boolean isInline() {
        return this.f977a.isInline();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: j */
    public boolean mo379j(int i7) {
        return this.f977a.mo379j(i7);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0096d m1169k() {
        return this.f977a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f977a);
        sb.append('?');
        return sb.toString();
    }
}
