package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2650l;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: loaded from: classes.dex */
final class C2603u implements Parcelable {
    public static final Parcelable.Creator<C2603u> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    final String f10314a;

    /* JADX INFO: renamed from: b */
    final String f10315b;

    /* JADX INFO: renamed from: c */
    final boolean f10316c;

    /* JADX INFO: renamed from: d */
    final int f10317d;

    /* JADX INFO: renamed from: e */
    final int f10318e;

    /* JADX INFO: renamed from: f */
    final String f10319f;

    /* JADX INFO: renamed from: r */
    final boolean f10320r;

    /* JADX INFO: renamed from: s */
    final boolean f10321s;

    /* JADX INFO: renamed from: t */
    final boolean f10322t;

    /* JADX INFO: renamed from: u */
    final boolean f10323u;

    /* JADX INFO: renamed from: v */
    final int f10324v;

    /* JADX INFO: renamed from: w */
    final String f10325w;

    /* JADX INFO: renamed from: x */
    final int f10326x;

    /* JADX INFO: renamed from: y */
    final boolean f10327y;

    /* JADX INFO: renamed from: androidx.fragment.app.u$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2603u createFromParcel(Parcel parcel) {
            return new C2603u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2603u[] newArray(int i7) {
            return new C2603u[i7];
        }
    }

    C2603u(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        this.f10314a = abstractComponentCallbacksC2591i.getClass().getName();
        this.f10315b = abstractComponentCallbacksC2591i.f10155f;
        this.f10316c = abstractComponentCallbacksC2591i.f10172z;
        this.f10317d = abstractComponentCallbacksC2591i.f10127I;
        this.f10318e = abstractComponentCallbacksC2591i.f10128J;
        this.f10319f = abstractComponentCallbacksC2591i.f10129K;
        this.f10320r = abstractComponentCallbacksC2591i.f10132N;
        this.f10321s = abstractComponentCallbacksC2591i.f10170x;
        this.f10322t = abstractComponentCallbacksC2591i.f10131M;
        this.f10323u = abstractComponentCallbacksC2591i.f10130L;
        this.f10324v = abstractComponentCallbacksC2591i.f10152d0.ordinal();
        this.f10325w = abstractComponentCallbacksC2591i.f10166t;
        this.f10326x = abstractComponentCallbacksC2591i.f10167u;
        this.f10327y = abstractComponentCallbacksC2591i.f10140V;
    }

    /* JADX INFO: renamed from: a */
    AbstractComponentCallbacksC2591i m12452a(AbstractC2595m abstractC2595m, ClassLoader classLoader) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iMo12267a = abstractC2595m.mo12267a(classLoader, this.f10314a);
        abstractComponentCallbacksC2591iMo12267a.f10155f = this.f10315b;
        abstractComponentCallbacksC2591iMo12267a.f10172z = this.f10316c;
        abstractComponentCallbacksC2591iMo12267a.f10120B = true;
        abstractComponentCallbacksC2591iMo12267a.f10127I = this.f10317d;
        abstractComponentCallbacksC2591iMo12267a.f10128J = this.f10318e;
        abstractComponentCallbacksC2591iMo12267a.f10129K = this.f10319f;
        abstractComponentCallbacksC2591iMo12267a.f10132N = this.f10320r;
        abstractComponentCallbacksC2591iMo12267a.f10170x = this.f10321s;
        abstractComponentCallbacksC2591iMo12267a.f10131M = this.f10322t;
        abstractComponentCallbacksC2591iMo12267a.f10130L = this.f10323u;
        abstractComponentCallbacksC2591iMo12267a.f10152d0 = AbstractC2650l.b.values()[this.f10324v];
        abstractComponentCallbacksC2591iMo12267a.f10166t = this.f10325w;
        abstractComponentCallbacksC2591iMo12267a.f10167u = this.f10326x;
        abstractComponentCallbacksC2591iMo12267a.f10140V = this.f10327y;
        return abstractComponentCallbacksC2591iMo12267a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f10314a);
        sb.append(" (");
        sb.append(this.f10315b);
        sb.append(")}:");
        if (this.f10316c) {
            sb.append(" fromLayout");
        }
        if (this.f10318e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f10318e));
        }
        String str = this.f10319f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f10319f);
        }
        if (this.f10320r) {
            sb.append(" retainInstance");
        }
        if (this.f10321s) {
            sb.append(" removing");
        }
        if (this.f10322t) {
            sb.append(" detached");
        }
        if (this.f10323u) {
            sb.append(" hidden");
        }
        if (this.f10325w != null) {
            sb.append(" targetWho=");
            sb.append(this.f10325w);
            sb.append(" targetRequestCode=");
            sb.append(this.f10326x);
        }
        if (this.f10327y) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10314a);
        parcel.writeString(this.f10315b);
        parcel.writeInt(this.f10316c ? 1 : 0);
        parcel.writeInt(this.f10317d);
        parcel.writeInt(this.f10318e);
        parcel.writeString(this.f10319f);
        parcel.writeInt(this.f10320r ? 1 : 0);
        parcel.writeInt(this.f10321s ? 1 : 0);
        parcel.writeInt(this.f10322t ? 1 : 0);
        parcel.writeInt(this.f10323u ? 1 : 0);
        parcel.writeInt(this.f10324v);
        parcel.writeString(this.f10325w);
        parcel.writeInt(this.f10326x);
        parcel.writeInt(this.f10327y ? 1 : 0);
    }

    C2603u(Parcel parcel) {
        this.f10314a = parcel.readString();
        this.f10315b = parcel.readString();
        this.f10316c = parcel.readInt() != 0;
        this.f10317d = parcel.readInt();
        this.f10318e = parcel.readInt();
        this.f10319f = parcel.readString();
        this.f10320r = parcel.readInt() != 0;
        this.f10321s = parcel.readInt() != 0;
        this.f10322t = parcel.readInt() != 0;
        this.f10323u = parcel.readInt() != 0;
        this.f10324v = parcel.readInt();
        this.f10325w = parcel.readString();
        this.f10326x = parcel.readInt();
        this.f10327y = parcel.readInt() != 0;
    }
}
