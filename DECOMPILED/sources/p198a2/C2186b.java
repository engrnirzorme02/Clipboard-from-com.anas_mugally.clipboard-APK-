package p198a2;

/* JADX INFO: renamed from: a2.b */
/* JADX INFO: loaded from: classes.dex */
final class C2186b extends AbstractC2191g {

    /* JADX INFO: renamed from: a */
    private final Integer f7119a;

    C2186b(Integer num) {
        this.f7119a = num;
    }

    @Override // p198a2.AbstractC2191g
    /* JADX INFO: renamed from: a */
    public Integer mo8924a() {
        return this.f7119a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2191g)) {
            return false;
        }
        Integer num = this.f7119a;
        Integer numMo8924a = ((AbstractC2191g) obj).mo8924a();
        if (num == null) {
            return numMo8924a == null;
        }
        return num.equals(numMo8924a);
    }

    public int hashCode() {
        Integer num = this.f7119a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f7119a + "}";
    }
}
