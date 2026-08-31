package p208b2;

/* JADX INFO: renamed from: b2.h */
/* JADX INFO: loaded from: classes.dex */
final class C2942h extends AbstractC2952r {

    /* JADX INFO: renamed from: a */
    private final Integer f12145a;

    /* JADX INFO: renamed from: b2.h$b */
    static final class b extends AbstractC2952r.a {

        /* JADX INFO: renamed from: a */
        private Integer f12146a;

        b() {
        }

        @Override // p208b2.AbstractC2952r.a
        /* JADX INFO: renamed from: a */
        public AbstractC2952r mo14739a() {
            return new C2942h(this.f12146a);
        }

        @Override // p208b2.AbstractC2952r.a
        /* JADX INFO: renamed from: b */
        public AbstractC2952r.a mo14740b(Integer num) {
            this.f12146a = num;
            return this;
        }
    }

    @Override // p208b2.AbstractC2952r
    /* JADX INFO: renamed from: b */
    public Integer mo14738b() {
        return this.f12145a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2952r)) {
            return false;
        }
        Integer num = this.f12145a;
        Integer numMo14738b = ((AbstractC2952r) obj).mo14738b();
        if (num == null) {
            return numMo14738b == null;
        }
        return num.equals(numMo14738b);
    }

    public int hashCode() {
        Integer num = this.f12145a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f12145a + "}";
    }

    private C2942h(Integer num) {
        this.f12145a = num;
    }
}
