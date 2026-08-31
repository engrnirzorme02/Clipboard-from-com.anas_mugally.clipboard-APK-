package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p104N.AbstractC0905b;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4469a implements Parcelable {
    public static final Parcelable.Creator<C4469a> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final C4489u f16847a;

    /* JADX INFO: renamed from: b */
    private final C4489u f16848b;

    /* JADX INFO: renamed from: c */
    private final c f16849c;

    /* JADX INFO: renamed from: d */
    private C4489u f16850d;

    /* JADX INFO: renamed from: e */
    private final int f16851e;

    /* JADX INFO: renamed from: f */
    private final int f16852f;

    /* JADX INFO: renamed from: r */
    private final int f16853r;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4469a createFromParcel(Parcel parcel) {
            return new C4469a((C4489u) parcel.readParcelable(C4489u.class.getClassLoader()), (C4489u) parcel.readParcelable(C4489u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C4489u) parcel.readParcelable(C4489u.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4469a[] newArray(int i7) {
            return new C4469a[i7];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        /* JADX INFO: renamed from: D */
        boolean mo20258D(long j7);
    }

    /* synthetic */ C4469a(C4489u c4489u, C4489u c4489u2, c cVar, C4489u c4489u3, int i7, a aVar) {
        this(c4489u, c4489u2, cVar, c4489u3, i7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4469a)) {
            return false;
        }
        C4469a c4469a = (C4469a) obj;
        return this.f16847a.equals(c4469a.f16847a) && this.f16848b.equals(c4469a.f16848b) && AbstractC0905b.m4125a(this.f16850d, c4469a.f16850d) && this.f16851e == c4469a.f16851e && this.f16849c.equals(c4469a.f16849c);
    }

    /* JADX INFO: renamed from: f */
    C4489u m20244f(C4489u c4489u) {
        if (c4489u.compareTo(this.f16847a) < 0) {
            return this.f16847a;
        }
        return c4489u.compareTo(this.f16848b) > 0 ? this.f16848b : c4489u;
    }

    /* JADX INFO: renamed from: g */
    public c m20245g() {
        return this.f16849c;
    }

    /* JADX INFO: renamed from: h */
    C4489u m20246h() {
        return this.f16848b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16847a, this.f16848b, this.f16850d, Integer.valueOf(this.f16851e), this.f16849c});
    }

    /* JADX INFO: renamed from: i */
    int m20247i() {
        return this.f16851e;
    }

    /* JADX INFO: renamed from: l */
    int m20248l() {
        return this.f16853r;
    }

    /* JADX INFO: renamed from: m */
    C4489u m20249m() {
        return this.f16850d;
    }

    /* JADX INFO: renamed from: n */
    C4489u m20250n() {
        return this.f16847a;
    }

    /* JADX INFO: renamed from: o */
    int m20251o() {
        return this.f16852f;
    }

    /* JADX INFO: renamed from: r */
    boolean m20252r(long j7) {
        if (this.f16847a.m20383o(1) > j7) {
            return false;
        }
        C4489u c4489u = this.f16848b;
        return j7 <= c4489u.m20383o(c4489u.f16998e);
    }

    /* JADX INFO: renamed from: s */
    void m20253s(C4489u c4489u) {
        this.f16850d = c4489u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f16847a, 0);
        parcel.writeParcelable(this.f16848b, 0);
        parcel.writeParcelable(this.f16850d, 0);
        parcel.writeParcelable(this.f16849c, 0);
        parcel.writeInt(this.f16851e);
    }

    private C4469a(C4489u c4489u, C4489u c4489u2, c cVar, C4489u c4489u3, int i7) {
        Objects.requireNonNull(c4489u, "start cannot be null");
        Objects.requireNonNull(c4489u2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f16847a = c4489u;
        this.f16848b = c4489u2;
        this.f16850d = c4489u3;
        this.f16851e = i7;
        this.f16849c = cVar;
        if (c4489u3 != null && c4489u.compareTo(c4489u3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c4489u3 != null && c4489u3.compareTo(c4489u2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i7 < 0 || i7 > AbstractC4466C.m20223m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f16853r = c4489u.m20380U(c4489u2) + 1;
        this.f16852f = (c4489u2.f16996c - c4489u.f16996c) + 1;
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* JADX INFO: renamed from: f */
        static final long f16854f = AbstractC4466C.m20211a(C4489u.m20374d(1900, 0).f16999f);

        /* JADX INFO: renamed from: g */
        static final long f16855g = AbstractC4466C.m20211a(C4489u.m20374d(2100, 11).f16999f);

        /* JADX INFO: renamed from: a */
        private long f16856a;

        /* JADX INFO: renamed from: b */
        private long f16857b;

        /* JADX INFO: renamed from: c */
        private Long f16858c;

        /* JADX INFO: renamed from: d */
        private int f16859d;

        /* JADX INFO: renamed from: e */
        private c f16860e;

        public b() {
            this.f16856a = f16854f;
            this.f16857b = f16855g;
            this.f16860e = C4479k.m20303a(Long.MIN_VALUE);
        }

        /* JADX INFO: renamed from: a */
        public C4469a m20256a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f16860e);
            C4489u c4489uM20375h = C4489u.m20375h(this.f16856a);
            C4489u c4489uM20375h2 = C4489u.m20375h(this.f16857b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l7 = this.f16858c;
            return new C4469a(c4489uM20375h, c4489uM20375h2, cVar, l7 == null ? null : C4489u.m20375h(l7.longValue()), this.f16859d, null);
        }

        /* JADX INFO: renamed from: b */
        public b m20257b(long j7) {
            this.f16858c = Long.valueOf(j7);
            return this;
        }

        b(C4469a c4469a) {
            this.f16856a = f16854f;
            this.f16857b = f16855g;
            this.f16860e = C4479k.m20303a(Long.MIN_VALUE);
            this.f16856a = c4469a.f16847a.f16999f;
            this.f16857b = c4469a.f16848b.f16999f;
            this.f16858c = Long.valueOf(c4469a.f16850d.f16999f);
            this.f16859d = c4469a.f16851e;
            this.f16860e = c4469a.f16849c;
        }
    }
}
