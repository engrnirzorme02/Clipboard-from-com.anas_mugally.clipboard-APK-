package p252g4;

import java.io.File;
import p276j4.AbstractC5868F;

/* JADX INFO: renamed from: g4.b */
/* JADX INFO: loaded from: classes.dex */
final class C5490b extends AbstractC5516z {

    /* JADX INFO: renamed from: a */
    private final AbstractC5868F f20829a;

    /* JADX INFO: renamed from: b */
    private final String f20830b;

    /* JADX INFO: renamed from: c */
    private final File f20831c;

    C5490b(AbstractC5868F abstractC5868F, String str, File file) {
        if (abstractC5868F == null) {
            throw new NullPointerException("Null report");
        }
        this.f20829a = abstractC5868F;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f20830b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f20831c = file;
    }

    @Override // p252g4.AbstractC5516z
    /* JADX INFO: renamed from: b */
    public AbstractC5868F mo24759b() {
        return this.f20829a;
    }

    @Override // p252g4.AbstractC5516z
    /* JADX INFO: renamed from: c */
    public File mo24760c() {
        return this.f20831c;
    }

    @Override // p252g4.AbstractC5516z
    /* JADX INFO: renamed from: d */
    public String mo24761d() {
        return this.f20830b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5516z) {
            AbstractC5516z abstractC5516z = (AbstractC5516z) obj;
            if (this.f20829a.equals(abstractC5516z.mo24759b()) && this.f20830b.equals(abstractC5516z.mo24761d()) && this.f20831c.equals(abstractC5516z.mo24760c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f20829a.hashCode() ^ 1000003) * 1000003) ^ this.f20830b.hashCode()) * 1000003) ^ this.f20831c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f20829a + ", sessionId=" + this.f20830b + ", reportFile=" + this.f20831c + "}";
    }
}
