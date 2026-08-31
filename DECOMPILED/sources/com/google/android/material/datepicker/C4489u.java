package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.u */
/* JADX INFO: loaded from: classes2.dex */
final class C4489u implements Comparable, Parcelable {
    public static final Parcelable.Creator<C4489u> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final Calendar f16994a;

    /* JADX INFO: renamed from: b */
    final int f16995b;

    /* JADX INFO: renamed from: c */
    final int f16996c;

    /* JADX INFO: renamed from: d */
    final int f16997d;

    /* JADX INFO: renamed from: e */
    final int f16998e;

    /* JADX INFO: renamed from: f */
    final long f16999f;

    /* JADX INFO: renamed from: r */
    private String f17000r;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.u$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4489u createFromParcel(Parcel parcel) {
            return C4489u.m20374d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4489u[] newArray(int i7) {
            return new C4489u[i7];
        }
    }

    private C4489u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM20215e = AbstractC4466C.m20215e(calendar);
        this.f16994a = calendarM20215e;
        this.f16995b = calendarM20215e.get(2);
        this.f16996c = calendarM20215e.get(1);
        this.f16997d = calendarM20215e.getMaximum(7);
        this.f16998e = calendarM20215e.getActualMaximum(5);
        this.f16999f = calendarM20215e.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    static C4489u m20374d(int i7, int i8) {
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        calendarM20223m.set(1, i7);
        calendarM20223m.set(2, i8);
        return new C4489u(calendarM20223m);
    }

    /* JADX INFO: renamed from: h */
    static C4489u m20375h(long j7) {
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        calendarM20223m.setTimeInMillis(j7);
        return new C4489u(calendarM20223m);
    }

    /* JADX INFO: renamed from: m */
    static C4489u m20376m() {
        return new C4489u(AbstractC4466C.m20221k());
    }

    /* JADX INFO: renamed from: J */
    String m20377J() {
        if (this.f17000r == null) {
            this.f17000r = AbstractC4478j.m20297l(this.f16994a.getTimeInMillis());
        }
        return this.f17000r;
    }

    /* JADX INFO: renamed from: M */
    long m20378M() {
        return this.f16994a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: T */
    C4489u m20379T(int i7) {
        Calendar calendarM20215e = AbstractC4466C.m20215e(this.f16994a);
        calendarM20215e.add(2, i7);
        return new C4489u(calendarM20215e);
    }

    /* JADX INFO: renamed from: U */
    int m20380U(C4489u c4489u) {
        if (this.f16994a instanceof GregorianCalendar) {
            return ((c4489u.f16996c - this.f16996c) * 12) + (c4489u.f16995b - this.f16995b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4489u c4489u) {
        return this.f16994a.compareTo(c4489u.f16994a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4489u)) {
            return false;
        }
        C4489u c4489u = (C4489u) obj;
        return this.f16995b == c4489u.f16995b && this.f16996c == c4489u.f16996c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16995b), Integer.valueOf(this.f16996c)});
    }

    /* JADX INFO: renamed from: n */
    int m20382n(int i7) {
        int i8 = this.f16994a.get(7);
        if (i7 <= 0) {
            i7 = this.f16994a.getFirstDayOfWeek();
        }
        int i9 = i8 - i7;
        return i9 < 0 ? i9 + this.f16997d : i9;
    }

    /* JADX INFO: renamed from: o */
    long m20383o(int i7) {
        Calendar calendarM20215e = AbstractC4466C.m20215e(this.f16994a);
        calendarM20215e.set(5, i7);
        return calendarM20215e.getTimeInMillis();
    }

    /* JADX INFO: renamed from: t */
    int m20384t(long j7) {
        Calendar calendarM20215e = AbstractC4466C.m20215e(this.f16994a);
        calendarM20215e.setTimeInMillis(j7);
        return calendarM20215e.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16996c);
        parcel.writeInt(this.f16995b);
    }
}
