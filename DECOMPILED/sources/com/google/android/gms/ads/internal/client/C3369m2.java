package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.AbstractC6543C;
import p314o2.C6556h;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3369m2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3369m2> CREATOR = new C3373n2();

    /* JADX INFO: renamed from: a */
    public final String f14022a;

    /* JADX INFO: renamed from: b */
    public final int f14023b;

    /* JADX INFO: renamed from: c */
    public final int f14024c;

    /* JADX INFO: renamed from: d */
    public final boolean f14025d;

    /* JADX INFO: renamed from: e */
    public final int f14026e;

    /* JADX INFO: renamed from: f */
    public final int f14027f;

    /* JADX INFO: renamed from: r */
    public final C3369m2[] f14028r;

    /* JADX INFO: renamed from: s */
    public final boolean f14029s;

    /* JADX INFO: renamed from: t */
    public final boolean f14030t;

    /* JADX INFO: renamed from: u */
    public boolean f14031u;

    /* JADX INFO: renamed from: v */
    public boolean f14032v;

    /* JADX INFO: renamed from: w */
    public boolean f14033w;

    /* JADX INFO: renamed from: x */
    public boolean f14034x;

    /* JADX INFO: renamed from: y */
    public boolean f14035y;

    /* JADX INFO: renamed from: z */
    public boolean f14036z;

    public C3369m2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: T */
    public static int m17287T(DisplayMetrics displayMetrics) {
        return (int) (m17291X(displayMetrics) * displayMetrics.density);
    }

    /* JADX INFO: renamed from: U */
    public static C3369m2 m17288U() {
        return new C3369m2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: V */
    public static C3369m2 m17289V() {
        return new C3369m2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: W */
    public static C3369m2 m17290W() {
        return new C3369m2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    /* JADX INFO: renamed from: X */
    private static int m17291X(DisplayMetrics displayMetrics) {
        int i7 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i7 <= 400) {
            return 32;
        }
        return i7 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14022a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8072t(parcel, 3, this.f14023b);
        AbstractC1947c.m8072t(parcel, 4, this.f14024c);
        AbstractC1947c.m8059g(parcel, 5, this.f14025d);
        AbstractC1947c.m8072t(parcel, 6, this.f14026e);
        AbstractC1947c.m8072t(parcel, 7, this.f14027f);
        AbstractC1947c.m8047H(parcel, 8, this.f14028r, i7, false);
        AbstractC1947c.m8059g(parcel, 9, this.f14029s);
        AbstractC1947c.m8059g(parcel, 10, this.f14030t);
        AbstractC1947c.m8059g(parcel, 11, this.f14031u);
        AbstractC1947c.m8059g(parcel, 12, this.f14032v);
        AbstractC1947c.m8059g(parcel, 13, this.f14033w);
        AbstractC1947c.m8059g(parcel, 14, this.f14034x);
        AbstractC1947c.m8059g(parcel, 15, this.f14035y);
        AbstractC1947c.m8059g(parcel, 16, this.f14036z);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C3369m2(Context context, C6556h c6556h) {
        this(context, new C6556h[]{c6556h});
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    public C3369m2(Context context, C6556h[] c6556hArr) {
        int iM27827a;
        int i7;
        int iM17291X;
        String string;
        int dimensionPixelSize;
        C6556h c6556h = c6556hArr[0];
        this.f14025d = false;
        boolean zM27831e = c6556h.m27831e();
        this.f14030t = zM27831e;
        this.f14034x = AbstractC6543C.m27794f(c6556h);
        this.f14035y = AbstractC6543C.m27795g(c6556h);
        boolean zM27792d = AbstractC6543C.m27792d(c6556h);
        this.f14036z = zM27792d;
        if (zM27831e) {
            C6556h c6556h2 = C6556h.f24740i;
            this.f14026e = c6556h2.m27829c();
            iM27827a = c6556h2.m27827a();
            this.f14023b = iM27827a;
        } else if (this.f14035y) {
            this.f14026e = c6556h.m27829c();
            iM27827a = AbstractC6543C.m27796h(c6556h);
            this.f14023b = iM27827a;
        } else if (zM27792d) {
            this.f14026e = c6556h.m27829c();
            iM27827a = AbstractC6543C.m27793e(c6556h);
            this.f14023b = iM27827a;
        } else {
            this.f14026e = c6556h.m27829c();
            iM27827a = c6556h.m27827a();
            this.f14023b = iM27827a;
        }
        boolean z7 = this.f14026e == -1;
        boolean z8 = iM27827a == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z7) {
            C3244B.m17190a();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    C3244B.m17190a();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i8 = displayMetrics3.heightPixels;
                        int i9 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i10 = displayMetrics3.heightPixels;
                        int i11 = displayMetrics3.widthPixels;
                        if (i10 == i8 && i11 == i9) {
                            int i12 = displayMetrics.widthPixels;
                            C3244B.m17190a();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i12 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f14027f = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.f14027f = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.f14027f = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.f14027f = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f14027f = dimensionPixelSize;
            }
            double d7 = dimensionPixelSize / displayMetrics.density;
            i7 = (int) d7;
            if (d7 - ((double) i7) >= 0.01d) {
                i7++;
            }
        } else {
            i7 = this.f14026e;
            C3244B.m17190a();
            this.f14027f = C7590g.m33289x(displayMetrics, this.f14026e);
        }
        if (z8) {
            iM17291X = m17291X(displayMetrics);
        } else {
            iM17291X = this.f14023b;
        }
        C3244B.m17190a();
        this.f14024c = C7590g.m33289x(displayMetrics, iM17291X);
        if (!z7 && !z8) {
            if (this.f14035y || this.f14036z) {
                int i13 = this.f14026e;
                int i14 = this.f14023b;
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 1 + String.valueOf(i14).length() + 3);
                sb.append(i13);
                sb.append("x");
                sb.append(i14);
                sb.append("_as");
                string = sb.toString();
            } else if (zM27831e) {
                string = "320x50_mb";
            } else {
                this.f14022a = c6556h.toString();
            }
            this.f14022a = string;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(iM17291X).length() + 3);
            sb2.append(i7);
            sb2.append("x");
            sb2.append(iM17291X);
            sb2.append("_as");
            this.f14022a = sb2.toString();
        }
        int length = c6556hArr.length;
        if (length > 1) {
            this.f14028r = new C3369m2[length];
            for (int i15 = 0; i15 < c6556hArr.length; i15++) {
                this.f14028r[i15] = new C3369m2(context, c6556hArr[i15]);
            }
        } else {
            this.f14028r = null;
        }
        this.f14029s = false;
        this.f14031u = false;
    }

    C3369m2(String str, int i7, int i8, boolean z7, int i9, int i10, C3369m2[] c3369m2Arr, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f14022a = str;
        this.f14023b = i7;
        this.f14024c = i8;
        this.f14025d = z7;
        this.f14026e = i9;
        this.f14027f = i10;
        this.f14028r = c3369m2Arr;
        this.f14029s = z8;
        this.f14030t = z9;
        this.f14031u = z10;
        this.f14032v = z11;
        this.f14033w = z12;
        this.f14034x = z13;
        this.f14035y = z14;
        this.f14036z = z15;
    }
}
