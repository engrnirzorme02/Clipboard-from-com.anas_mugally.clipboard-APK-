package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p205b.InterfaceC2917a;
import p205b.InterfaceC2918b;

/* JADX INFO: renamed from: androidx.browser.customtabs.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2380c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2918b f8367a;

    /* JADX INFO: renamed from: b */
    private final ComponentName f8368b;

    /* JADX INFO: renamed from: c */
    private final Context f8369c;

    /* JADX INFO: renamed from: androidx.browser.customtabs.c$a */
    class a extends InterfaceC2917a.a {

        /* JADX INFO: renamed from: a */
        private Handler f8370a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC2379b f8371b;

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC7661a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bundle f8373a;

            RunnableC7661a(Bundle bundle) {
                this.f8373a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onUnminimized(this.f8373a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f8375a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Bundle f8376b;

            b(int i7, Bundle bundle) {
                this.f8375a = i7;
                this.f8376b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onNavigationEvent(this.f8375a, this.f8376b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$c */
        class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f8378a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Bundle f8379b;

            c(String str, Bundle bundle) {
                this.f8378a = str;
                this.f8379b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.extraCallback(this.f8378a, this.f8379b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$d */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bundle f8381a;

            d(Bundle bundle) {
                this.f8381a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onMessageChannelReady(this.f8381a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$e */
        class e implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f8383a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Bundle f8384b;

            e(String str, Bundle bundle) {
                this.f8383a = str;
                this.f8384b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onPostMessage(this.f8383a, this.f8384b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$f */
        class f implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f8386a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Uri f8387b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ boolean f8388c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ Bundle f8389d;

            f(int i7, Uri uri, boolean z7, Bundle bundle) {
                this.f8386a = i7;
                this.f8387b = uri;
                this.f8388c = z7;
                this.f8389d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onRelationshipValidationResult(this.f8386a, this.f8387b, this.f8388c, this.f8389d);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$g */
        class g implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f8391a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f8392b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Bundle f8393c;

            g(int i7, int i8, Bundle bundle) {
                this.f8391a = i7;
                this.f8392b = i8;
                this.f8393c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onActivityResized(this.f8391a, this.f8392b, this.f8393c);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$h */
        class h implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bundle f8395a;

            h(Bundle bundle) {
                this.f8395a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onWarmupCompleted(this.f8395a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$i */
        class i implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f8397a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f8398b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f8399c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f8400d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ int f8401e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Bundle f8402f;

            i(int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
                this.f8397a = i7;
                this.f8398b = i8;
                this.f8399c = i9;
                this.f8400d = i10;
                this.f8401e = i11;
                this.f8402f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onActivityLayout(this.f8397a, this.f8398b, this.f8399c, this.f8400d, this.f8401e, this.f8402f);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$j */
        class j implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bundle f8404a;

            j(Bundle bundle) {
                this.f8404a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8371b.onMinimized(this.f8404a);
            }
        }

        a(AbstractC2379b abstractC2379b) {
            this.f8371b = abstractC2379b;
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: B */
        public Bundle mo10190B(String str, Bundle bundle) {
            AbstractC2379b abstractC2379b = this.f8371b;
            if (abstractC2379b == null) {
                return null;
            }
            return abstractC2379b.extraCallbackWithResult(str, bundle);
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: B0 */
        public void mo10191B0(Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new d(bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: D0 */
        public void mo10192D0(int i7, Uri uri, boolean z7, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new f(i7, uri, z7, bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: J */
        public void mo10193J(Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new j(bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: M */
        public void mo10194M(Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new RunnableC7661a(bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: U */
        public void mo10195U(int i7, int i8, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new g(i7, i8, bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: d0 */
        public void mo10196d0(String str, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new c(str, bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: h0 */
        public void mo10197h0(Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new h(bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: l0 */
        public void mo10198l0(int i7, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new b(i7, bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: o */
        public void mo10199o(int i7, int i8, int i9, int i10, int i11, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new i(i7, i8, i9, i10, i11, bundle));
        }

        @Override // p205b.InterfaceC2917a
        /* JADX INFO: renamed from: w0 */
        public void mo10200w0(String str, Bundle bundle) {
            if (this.f8371b == null) {
                return;
            }
            this.f8370a.post(new e(str, bundle));
        }
    }

    AbstractC2380c(InterfaceC2918b interfaceC2918b, ComponentName componentName, Context context) {
        this.f8367a = interfaceC2918b;
        this.f8368b = componentName;
        this.f8369c = context;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10183a(Context context, String str, AbstractServiceConnectionC2382e abstractServiceConnectionC2382e) {
        abstractServiceConnectionC2382e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC2382e, 33);
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC2917a.a m10184b(AbstractC2379b abstractC2379b) {
        return new a(abstractC2379b);
    }

    /* JADX INFO: renamed from: c */
    public static String m10185c(Context context, List list) {
        return m10186d(context, list, false);
    }

    /* JADX INFO: renamed from: d */
    public static String m10186d(Context context, List list, boolean z7) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z7 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    /* JADX INFO: renamed from: f */
    private C2383f m10187f(AbstractC2379b abstractC2379b, PendingIntent pendingIntent) {
        boolean zMo14641K;
        InterfaceC2917a.a aVarM10184b = m10184b(abstractC2379b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zMo14641K = this.f8367a.mo14643g0(aVarM10184b, bundle);
            } else {
                zMo14641K = this.f8367a.mo14641K(aVarM10184b);
            }
            if (zMo14641K) {
                return new C2383f(this.f8367a, aVarM10184b, this.f8368b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public C2383f m10188e(AbstractC2379b abstractC2379b) {
        return m10187f(abstractC2379b, null);
    }

    /* JADX INFO: renamed from: g */
    public boolean m10189g(long j7) {
        try {
            return this.f8367a.mo14640F(j7);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
