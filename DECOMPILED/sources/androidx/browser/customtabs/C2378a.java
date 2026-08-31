package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.browser.customtabs.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2378a {

    /* JADX INFO: renamed from: a */
    public final Integer f8359a;

    /* JADX INFO: renamed from: b */
    public final Integer f8360b;

    /* JADX INFO: renamed from: c */
    public final Integer f8361c;

    /* JADX INFO: renamed from: d */
    public final Integer f8362d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Integer f8363a;

        /* JADX INFO: renamed from: b */
        private Integer f8364b;

        /* JADX INFO: renamed from: c */
        private Integer f8365c;

        /* JADX INFO: renamed from: d */
        private Integer f8366d;

        /* JADX INFO: renamed from: a */
        public C2378a m10182a() {
            return new C2378a(this.f8363a, this.f8364b, this.f8365c, this.f8366d);
        }
    }

    C2378a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f8359a = num;
        this.f8360b = num2;
        this.f8361c = num3;
        this.f8362d = num4;
    }

    /* JADX INFO: renamed from: a */
    Bundle m10181a() {
        Bundle bundle = new Bundle();
        Integer num = this.f8359a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f8360b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f8361c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f8362d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
