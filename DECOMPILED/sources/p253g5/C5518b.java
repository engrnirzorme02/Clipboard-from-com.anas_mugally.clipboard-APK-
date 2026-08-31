package p253g5;

import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: g5.b */
/* JADX INFO: loaded from: classes.dex */
public class C5518b {

    /* JADX INFO: renamed from: a */
    private String f20949a;

    public C5518b(String str) {
        this.f20949a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m24929a() {
        return this.f20949a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5518b) {
            return AbstractC3714q.m18053b(this.f20949a, ((C5518b) obj).f20949a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f20949a);
    }

    public String toString() {
        return AbstractC3714q.m18055d(this).m18056a("token", this.f20949a).toString();
    }
}
