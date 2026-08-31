package p112O0;

import android.app.Notification;

/* JADX INFO: renamed from: O0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1092e {

    /* JADX INFO: renamed from: a */
    private final int f3948a;

    /* JADX INFO: renamed from: b */
    private final int f3949b;

    /* JADX INFO: renamed from: c */
    private final Notification f3950c;

    public C1092e(int i7, Notification notification, int i8) {
        this.f3948a = i7;
        this.f3950c = notification;
        this.f3949b = i8;
    }

    /* JADX INFO: renamed from: a */
    public int m4835a() {
        return this.f3949b;
    }

    /* JADX INFO: renamed from: b */
    public Notification m4836b() {
        return this.f3950c;
    }

    /* JADX INFO: renamed from: c */
    public int m4837c() {
        return this.f3948a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1092e.class != obj.getClass()) {
            return false;
        }
        C1092e c1092e = (C1092e) obj;
        if (this.f3948a == c1092e.f3948a && this.f3949b == c1092e.f3949b) {
            return this.f3950c.equals(c1092e.f3950c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3948a * 31) + this.f3949b) * 31) + this.f3950c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3948a + ", mForegroundServiceType=" + this.f3949b + ", mNotification=" + this.f3950c + '}';
    }
}
