package p404z2;

/* JADX INFO: renamed from: z2.n */
/* JADX INFO: loaded from: classes.dex */
final class C7597n extends AbstractC7607x {

    /* JADX INFO: renamed from: a */
    private final int f30262a;

    /* JADX INFO: renamed from: b */
    private final int f30263b;

    /* JADX INFO: renamed from: c */
    private final boolean f30264c;

    C7597n(int i7, int i8, boolean z7) {
        this.f30262a = i7;
        this.f30263b = i8;
        this.f30264c = z7;
    }

    @Override // p404z2.AbstractC7607x
    /* JADX INFO: renamed from: a */
    public final int mo33319a() {
        return this.f30262a;
    }

    @Override // p404z2.AbstractC7607x
    /* JADX INFO: renamed from: b */
    public final int mo33320b() {
        return this.f30263b;
    }

    @Override // p404z2.AbstractC7607x
    /* JADX INFO: renamed from: c */
    public final boolean mo33321c() {
        return this.f30264c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7607x) {
            AbstractC7607x abstractC7607x = (AbstractC7607x) obj;
            if (this.f30262a == abstractC7607x.mo33319a() && this.f30263b == abstractC7607x.mo33320b() && this.f30264c == abstractC7607x.mo33321c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f30264c ? 1237 : 1231) ^ ((((this.f30262a ^ 1000003) * 1000003) ^ this.f30263b) * 1000003);
    }

    public final String toString() {
        int i7 = this.f30262a;
        int length = String.valueOf(i7).length();
        int i8 = this.f30263b;
        int length2 = String.valueOf(i8).length();
        boolean z7 = this.f30264c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z7).length() + 1);
        sb.append("OfflineAdConfig{impressionPrerequisite=");
        sb.append(i7);
        sb.append(", clickPrerequisite=");
        sb.append(i8);
        sb.append(", notificationFlowEnabled=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
