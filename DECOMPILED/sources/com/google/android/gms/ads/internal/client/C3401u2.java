package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p314o2.AbstractC6569u;
import p314o2.C6556h;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3401u2 {

    /* JADX INFO: renamed from: a */
    private final C6556h[] f14096a;

    /* JADX INFO: renamed from: b */
    private final String f14097b;

    public C3401u2(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC6569u.f24764a);
        String string = typedArrayObtainAttributes.getString(AbstractC6569u.f24765b);
        String string2 = typedArrayObtainAttributes.getString(AbstractC6569u.f24766c);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f14096a = m17323c(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f14096a = m17323c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(AbstractC6569u.f24767d);
        this.f14097b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* JADX INFO: renamed from: c */
    private static C6556h[] m17323c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        C6556h[] c6556hArr = new C6556h[length];
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            String strTrim = strArrSplit[i7].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    c6556hArr[i7] = new C6556h("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24740i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24742k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24741j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24743l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24744m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24746o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24745n;
            } else if ("FLUID".equals(strTrim)) {
                c6556hArr[i7] = C6556h.f24747p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                c6556hArr[i7] = C6556h.f24749r;
            }
        }
        if (length != 0) {
            return c6556hArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public final C6556h[] m17324a(boolean z7) {
        if (z7 || this.f14096a.length == 1) {
            return this.f14096a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    /* JADX INFO: renamed from: b */
    public final String m17325b() {
        return this.f14097b;
    }
}
