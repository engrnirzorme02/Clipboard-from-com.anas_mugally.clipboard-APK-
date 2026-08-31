package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.AbstractC2436b;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.browser.customtabs.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2381d {

    /* JADX INFO: renamed from: a */
    public final Intent f8406a;

    /* JADX INFO: renamed from: b */
    public final Bundle f8407b;

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static ActivityOptions m10202a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static String m10203a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        static void m10204a(ActivityOptions activityOptions, boolean z7) {
            activityOptions.setShareIdentityEnabled(z7);
        }
    }

    C2381d(Intent intent, Bundle bundle) {
        this.f8406a = intent;
        this.f8407b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m10201a(Context context, Uri uri) {
        this.f8406a.setData(uri);
        AbstractC2436b.startActivity(context, this.f8406a, this.f8407b);
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d */
    public static final class d {

        /* JADX INFO: renamed from: c */
        private ArrayList f8410c;

        /* JADX INFO: renamed from: d */
        private ActivityOptions f8411d;

        /* JADX INFO: renamed from: e */
        private ArrayList f8412e;

        /* JADX INFO: renamed from: f */
        private SparseArray f8413f;

        /* JADX INFO: renamed from: g */
        private Bundle f8414g;

        /* JADX INFO: renamed from: j */
        private boolean f8417j;

        /* JADX INFO: renamed from: a */
        private final Intent f8408a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        private final C2378a.a f8409b = new C2378a.a();

        /* JADX INFO: renamed from: h */
        private int f8415h = 0;

        /* JADX INFO: renamed from: i */
        private boolean f8416i = true;

        public d() {
        }

        /* JADX INFO: renamed from: b */
        private void m10205b() {
            String strM10203a = b.m10203a();
            if (TextUtils.isEmpty(strM10203a)) {
                return;
            }
            Bundle bundleExtra = this.f8408a.hasExtra("com.android.browser.headers") ? this.f8408a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strM10203a);
            this.f8408a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* JADX INFO: renamed from: d */
        private void m10206d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f8408a.putExtras(bundle);
        }

        /* JADX INFO: renamed from: e */
        private void m10207e() {
            if (this.f8411d == null) {
                this.f8411d = a.m10202a();
            }
            c.m10204a(this.f8411d, this.f8417j);
        }

        /* JADX INFO: renamed from: a */
        public C2381d m10208a() {
            if (!this.f8408a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m10206d(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f8410c;
            if (arrayList != null) {
                this.f8408a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f8412e;
            if (arrayList2 != null) {
                this.f8408a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f8408a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8416i);
            this.f8408a.putExtras(this.f8409b.m10182a().m10181a());
            Bundle bundle = this.f8414g;
            if (bundle != null) {
                this.f8408a.putExtras(bundle);
            }
            if (this.f8413f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f8413f);
                this.f8408a.putExtras(bundle2);
            }
            this.f8408a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f8415h);
            int i7 = Build.VERSION.SDK_INT;
            m10205b();
            if (i7 >= 34) {
                m10207e();
            }
            ActivityOptions activityOptions = this.f8411d;
            return new C2381d(this.f8408a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        /* JADX INFO: renamed from: c */
        public d m10209c(C2383f c2383f) {
            this.f8408a.setPackage(c2383f.m10214e().getPackageName());
            m10206d(c2383f.m10213d(), c2383f.m10215f());
            return this;
        }

        public d(C2383f c2383f) {
            if (c2383f != null) {
                m10209c(c2383f);
            }
        }
    }
}
