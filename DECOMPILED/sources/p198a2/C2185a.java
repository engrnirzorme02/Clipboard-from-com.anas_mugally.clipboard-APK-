package p198a2;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
final class C2185a extends AbstractC2188d {

    /* JADX INFO: renamed from: a */
    private final Integer f7115a;

    /* JADX INFO: renamed from: b */
    private final Object f7116b;

    /* JADX INFO: renamed from: c */
    private final EnumC2190f f7117c;

    /* JADX INFO: renamed from: d */
    private final AbstractC2191g f7118d;

    C2185a(Integer num, Object obj, EnumC2190f enumC2190f, AbstractC2191g abstractC2191g, AbstractC2189e abstractC2189e) {
        this.f7115a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f7116b = obj;
        if (enumC2190f == null) {
            throw new NullPointerException("Null priority");
        }
        this.f7117c = enumC2190f;
        this.f7118d = abstractC2191g;
    }

    @Override // p198a2.AbstractC2188d
    /* JADX INFO: renamed from: a */
    public Integer mo8919a() {
        return this.f7115a;
    }

    @Override // p198a2.AbstractC2188d
    /* JADX INFO: renamed from: b */
    public AbstractC2189e mo8920b() {
        return null;
    }

    @Override // p198a2.AbstractC2188d
    /* JADX INFO: renamed from: c */
    public Object mo8921c() {
        return this.f7116b;
    }

    @Override // p198a2.AbstractC2188d
    /* JADX INFO: renamed from: d */
    public EnumC2190f mo8922d() {
        return this.f7117c;
    }

    @Override // p198a2.AbstractC2188d
    /* JADX INFO: renamed from: e */
    public AbstractC2191g mo8923e() {
        return this.f7118d;
    }

    public boolean equals(Object obj) {
        AbstractC2191g abstractC2191g;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2188d) {
            AbstractC2188d abstractC2188d = (AbstractC2188d) obj;
            Integer num = this.f7115a;
            if (num != null ? num.equals(abstractC2188d.mo8919a()) : abstractC2188d.mo8919a() == null) {
                if (this.f7116b.equals(abstractC2188d.mo8921c()) && this.f7117c.equals(abstractC2188d.mo8922d()) && ((abstractC2191g = this.f7118d) != null ? abstractC2191g.equals(abstractC2188d.mo8923e()) : abstractC2188d.mo8923e() == null)) {
                    abstractC2188d.mo8920b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f7115a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f7116b.hashCode()) * 1000003) ^ this.f7117c.hashCode()) * 1000003;
        AbstractC2191g abstractC2191g = this.f7118d;
        return (iHashCode ^ (abstractC2191g != null ? abstractC2191g.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f7115a + ", payload=" + this.f7116b + ", priority=" + this.f7117c + ", productData=" + this.f7118d + ", eventContext=" + ((Object) null) + "}";
    }
}
