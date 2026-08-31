package p225d1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5210b implements Serializable {

    /* JADX INFO: renamed from: a */
    private int f19909a;

    /* JADX INFO: renamed from: b */
    private long f19910b;

    /* JADX INFO: renamed from: c */
    private String f19911c;

    public C5210b(int i7, long j7, String text) {
        AbstractC6118n.m27187e(text, "text");
        this.f19909a = i7;
        this.f19910b = j7;
        this.f19911c = text;
    }

    /* JADX INFO: renamed from: a */
    public final int m24104a() {
        return this.f19909a;
    }

    /* JADX INFO: renamed from: b */
    public final String m24105b() {
        return this.f19911c;
    }

    /* JADX INFO: renamed from: c */
    public final long m24106c() {
        return this.f19910b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5210b)) {
            return false;
        }
        C5210b c5210b = (C5210b) obj;
        return this.f19909a == c5210b.f19909a && this.f19910b == c5210b.f19910b && AbstractC6118n.m27183a(this.f19911c, c5210b.f19911c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19909a) * 31) + Long.hashCode(this.f19910b)) * 31) + this.f19911c.hashCode();
    }

    public String toString() {
        return "TemporaryText(id=" + this.f19909a + ", time=" + this.f19910b + ", text=" + this.f19911c + ')';
    }

    public /* synthetic */ C5210b(int i7, long j7, String str, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? System.currentTimeMillis() : j7, (i8 & 4) != 0 ? "" : str);
    }
}
