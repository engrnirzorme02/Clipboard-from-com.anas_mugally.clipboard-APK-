package pub.devrel.easypermissions;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import p096L6.AbstractC0856b;

/* JADX INFO: renamed from: pub.devrel.easypermissions.a */
/* JADX INFO: loaded from: classes.dex */
public class C6780a implements Parcelable {
    public static final Parcelable.Creator<C6780a> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final int f27223a;

    /* JADX INFO: renamed from: b */
    private final String f27224b;

    /* JADX INFO: renamed from: c */
    private final String f27225c;

    /* JADX INFO: renamed from: d */
    private final String f27226d;

    /* JADX INFO: renamed from: e */
    private final String f27227e;

    /* JADX INFO: renamed from: f */
    private final int f27228f;

    /* JADX INFO: renamed from: r */
    private final int f27229r;

    /* JADX INFO: renamed from: s */
    private Object f27230s;

    /* JADX INFO: renamed from: t */
    private Context f27231t;

    /* JADX INFO: renamed from: pub.devrel.easypermissions.a$a */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6780a createFromParcel(Parcel parcel) {
            return new C6780a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6780a[] newArray(int i7) {
            return new C6780a[i7];
        }
    }

    /* JADX INFO: renamed from: pub.devrel.easypermissions.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Object f27232a;

        /* JADX INFO: renamed from: b */
        private final Context f27233b;

        /* JADX INFO: renamed from: d */
        private String f27235d;

        /* JADX INFO: renamed from: e */
        private String f27236e;

        /* JADX INFO: renamed from: f */
        private String f27237f;

        /* JADX INFO: renamed from: g */
        private String f27238g;

        /* JADX INFO: renamed from: c */
        private int f27234c = -1;

        /* JADX INFO: renamed from: h */
        private int f27239h = -1;

        /* JADX INFO: renamed from: i */
        private boolean f27240i = false;

        public b(Activity activity) {
            this.f27232a = activity;
            this.f27233b = activity;
        }

        /* JADX INFO: renamed from: a */
        public C6780a m29623a() {
            this.f27235d = TextUtils.isEmpty(this.f27235d) ? this.f27233b.getString(AbstractC0856b.f3415a) : this.f27235d;
            this.f27236e = TextUtils.isEmpty(this.f27236e) ? this.f27233b.getString(AbstractC0856b.f3416b) : this.f27236e;
            this.f27237f = TextUtils.isEmpty(this.f27237f) ? this.f27233b.getString(R.string.ok) : this.f27237f;
            this.f27238g = TextUtils.isEmpty(this.f27238g) ? this.f27233b.getString(R.string.cancel) : this.f27238g;
            int i7 = this.f27239h;
            if (i7 <= 0) {
                i7 = 16061;
            }
            this.f27239h = i7;
            return new C6780a(this.f27232a, this.f27234c, this.f27235d, this.f27236e, this.f27237f, this.f27238g, this.f27239h, this.f27240i ? 268435456 : 0, null);
        }
    }

    /* synthetic */ C6780a(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: renamed from: a */
    static C6780a m29617a(Intent intent, Activity activity) {
        C6780a c6780aM29623a = (C6780a) intent.getParcelableExtra("extra_app_settings");
        if (c6780aM29623a == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            c6780aM29623a = new b(activity).m29623a();
        }
        c6780aM29623a.m29618c(activity);
        return c6780aM29623a;
    }

    /* JADX INFO: renamed from: c */
    private void m29618c(Object obj) {
        this.f27230s = obj;
        if (obj instanceof Activity) {
            this.f27231t = (Activity) obj;
        } else {
            if (obj instanceof AbstractComponentCallbacksC2591i) {
                this.f27231t = ((AbstractComponentCallbacksC2591i) obj).m12204u();
                return;
            }
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    /* JADX INFO: renamed from: b */
    int m29619b() {
        return this.f27229r;
    }

    /* JADX INFO: renamed from: d */
    DialogInterfaceC2241b m29620d(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i7 = this.f27223a;
        return (i7 != -1 ? new DialogInterfaceC2241b.a(this.f27231t, i7) : new DialogInterfaceC2241b.a(this.f27231t)).mo9100d(false).mo9116t(this.f27225c).mo9105i(this.f27224b).mo9112p(this.f27226d, onClickListener).mo9107k(this.f27227e, onClickListener2).m9118v();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f27223a);
        parcel.writeString(this.f27224b);
        parcel.writeString(this.f27225c);
        parcel.writeString(this.f27226d);
        parcel.writeString(this.f27227e);
        parcel.writeInt(this.f27228f);
        parcel.writeInt(this.f27229r);
    }

    /* synthetic */ C6780a(Object obj, int i7, String str, String str2, String str3, String str4, int i8, int i9, a aVar) {
        this(obj, i7, str, str2, str3, str4, i8, i9);
    }

    private C6780a(Parcel parcel) {
        this.f27223a = parcel.readInt();
        this.f27224b = parcel.readString();
        this.f27225c = parcel.readString();
        this.f27226d = parcel.readString();
        this.f27227e = parcel.readString();
        this.f27228f = parcel.readInt();
        this.f27229r = parcel.readInt();
    }

    private C6780a(Object obj, int i7, String str, String str2, String str3, String str4, int i8, int i9) {
        m29618c(obj);
        this.f27223a = i7;
        this.f27224b = str;
        this.f27225c = str2;
        this.f27226d = str3;
        this.f27227e = str4;
        this.f27228f = i8;
        this.f27229r = i9;
    }
}
