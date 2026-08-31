package p170W2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.internal.ads.zzbbn;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: W2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1837b extends AbstractC1945a {

    /* JADX INFO: renamed from: a */
    final int f5973a;

    /* JADX INFO: renamed from: b */
    private final int f5974b;

    /* JADX INFO: renamed from: c */
    private final PendingIntent f5975c;

    /* JADX INFO: renamed from: d */
    private final String f5976d;

    /* JADX INFO: renamed from: e */
    public static final C1837b f5972e = new C1837b(0);
    public static final Parcelable.Creator<C1837b> CREATOR = new C1851p();

    C1837b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f5973a = i7;
        this.f5974b = i8;
        this.f5975c = pendingIntent;
        this.f5976d = str;
    }

    /* JADX INFO: renamed from: Y */
    static String m7595Y(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbbn.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i7 + ")";
                }
        }
    }

    /* JADX INFO: renamed from: T */
    public int m7596T() {
        return this.f5974b;
    }

    /* JADX INFO: renamed from: U */
    public String m7597U() {
        return this.f5976d;
    }

    /* JADX INFO: renamed from: V */
    public PendingIntent m7598V() {
        return this.f5975c;
    }

    /* JADX INFO: renamed from: W */
    public boolean m7599W() {
        return (this.f5974b == 0 || this.f5975c == null) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public boolean m7600X() {
        return this.f5974b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1837b)) {
            return false;
        }
        C1837b c1837b = (C1837b) obj;
        return this.f5974b == c1837b.f5974b && AbstractC3714q.m18053b(this.f5975c, c1837b.f5975c) && AbstractC3714q.m18053b(this.f5976d, c1837b.f5976d);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f5974b), this.f5975c, this.f5976d);
    }

    public String toString() {
        AbstractC3714q.a aVarM18055d = AbstractC3714q.m18055d(this);
        aVarM18055d.m18056a("statusCode", m7595Y(this.f5974b));
        aVarM18055d.m18056a("resolution", this.f5975c);
        aVarM18055d.m18056a("message", this.f5976d);
        return aVarM18055d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f5973a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, m7596T());
        AbstractC1947c.m8042C(parcel, 3, m7598V(), i7, false);
        AbstractC1947c.m8044E(parcel, 4, m7597U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C1837b(int i7) {
        this(i7, null, null);
    }

    public C1837b(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public C1837b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }
}
