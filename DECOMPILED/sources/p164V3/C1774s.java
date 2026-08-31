package p164V3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Date;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6124t;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p166V5.AbstractC1792a;

/* JADX INFO: renamed from: V3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1774s implements Comparable, Parcelable {

    /* JADX INFO: renamed from: a */
    private final long f5824a;

    /* JADX INFO: renamed from: b */
    private final int f5825b;

    /* JADX INFO: renamed from: c */
    public static final b f5823c = new b(null);
    public static final Parcelable.Creator<C1774s> CREATOR = new a();

    /* JADX INFO: renamed from: V3.s$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1774s createFromParcel(Parcel source) {
            AbstractC6118n.m27187e(source, "source");
            return new C1774s(source.readLong(), source.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1774s[] newArray(int i7) {
            return new C1774s[i7];
        }
    }

    /* JADX INFO: renamed from: V3.s$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final C1435m m7443d(Date date) {
            long time = date.getTime();
            long j7 = zzbbn.zzq.zzf;
            long j8 = time / j7;
            int time2 = (int) ((date.getTime() % j7) * ((long) 1000000));
            return time2 < 0 ? AbstractC1440r.m6083a(Long.valueOf(j8 - 1), Integer.valueOf(time2 + 1000000000)) : AbstractC1440r.m6083a(Long.valueOf(j8), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final void m7444e(long j7, int i7) {
            if (i7 < 0 || i7 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i7).toString());
            }
            if (-62135596800L > j7 || j7 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j7).toString());
            }
        }

        /* JADX INFO: renamed from: c */
        public final C1774s m7445c() {
            return new C1774s(new Date());
        }

        private b() {
        }
    }

    public C1774s(long j7, int i7) {
        f5823c.m7444e(j7, i7);
        this.f5824a = j7;
        this.f5825b = i7;
    }

    /* JADX INFO: renamed from: m */
    public static final C1774s m7435m() {
        return f5823c.m7445c();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1774s other) {
        AbstractC6118n.m27187e(other, "other");
        return AbstractC1792a.m7504b(this, other, new AbstractC6124t() { // from class: V3.s.c
            @Override // p286k6.InterfaceC6081g
            public Object get(Object obj) {
                return Long.valueOf(((C1774s) obj).m7438h());
            }
        }, new AbstractC6124t() { // from class: V3.s.d
            @Override // p286k6.InterfaceC6081g
            public Object get(Object obj) {
                return Integer.valueOf(((C1774s) obj).m7437d());
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final int m7437d() {
        return this.f5825b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1774s) && compareTo((C1774s) obj) == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final long m7438h() {
        return this.f5824a;
    }

    public int hashCode() {
        long j7 = this.f5824a;
        return (((((int) j7) * 1369) + ((int) (j7 >> 32))) * 37) + this.f5825b;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f5824a + ", nanoseconds=" + this.f5825b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC6118n.m27187e(dest, "dest");
        dest.writeLong(this.f5824a);
        dest.writeInt(this.f5825b);
    }

    public C1774s(Date date) {
        AbstractC6118n.m27187e(date, "date");
        b bVar = f5823c;
        C1435m c1435mM7443d = bVar.m7443d(date);
        long jLongValue = ((Number) c1435mM7443d.m6068a()).longValue();
        int iIntValue = ((Number) c1435mM7443d.m6069b()).intValue();
        bVar.m7444e(jLongValue, iIntValue);
        this.f5824a = jLongValue;
        this.f5825b = iIntValue;
    }
}
