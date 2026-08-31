package p032D6;

import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: D6.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230k implements InterfaceC0096d {

    /* JADX INFO: renamed from: a */
    private final String f949a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0096d f950b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0096d f951c;

    /* JADX INFO: renamed from: d */
    private final int f952d;

    public /* synthetic */ AbstractC0230k(String str, InterfaceC0096d interfaceC0096d, InterfaceC0096d interfaceC0096d2, AbstractC6112h abstractC6112h) {
        this(str, interfaceC0096d, interfaceC0096d2);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: a */
    public String mo371a() {
        return this.f949a;
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
        Integer numM = AbstractC6406h.m27543m(name);
        if (numM != null) {
            return numM.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: e */
    public AbstractC0098f mo374e() {
        return AbstractC0099g.c.f529a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0230k)) {
            return false;
        }
        AbstractC0230k abstractC0230k = (AbstractC0230k) obj;
        return AbstractC6118n.m27183a(mo371a(), abstractC0230k.mo371a()) && AbstractC6118n.m27183a(this.f950b, abstractC0230k.f950b) && AbstractC6118n.m27183a(this.f951c, abstractC0230k.f951c);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: f */
    public int mo375f() {
        return this.f952d;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: g */
    public String mo376g(int i7) {
        return String.valueOf(i7);
    }

    @Override // p016B6.InterfaceC0096d
    public List getAnnotations() {
        return InterfaceC0096d.a.m380a(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: h */
    public List mo377h(int i7) {
        if (i7 >= 0) {
            return AbstractC1638q.m6765j();
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + mo371a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((mo371a().hashCode() * 31) + this.f950b.hashCode()) * 31) + this.f951c.hashCode();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: i */
    public InterfaceC0096d mo378i(int i7) {
        if (i7 >= 0) {
            int i8 = i7 % 2;
            if (i8 == 0) {
                return this.f950b;
            }
            if (i8 == 1) {
                return this.f951c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + mo371a() + " expects only non-negative indices").toString());
    }

    @Override // p016B6.InterfaceC0096d
    public boolean isInline() {
        return InterfaceC0096d.a.m381b(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: j */
    public boolean mo379j(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + mo371a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return mo371a() + '(' + this.f950b + ", " + this.f951c + ')';
    }

    private AbstractC0230k(String str, InterfaceC0096d interfaceC0096d, InterfaceC0096d interfaceC0096d2) {
        this.f949a = str;
        this.f950b = interfaceC0096d;
        this.f951c = interfaceC0096d2;
        this.f952d = 2;
    }
}
