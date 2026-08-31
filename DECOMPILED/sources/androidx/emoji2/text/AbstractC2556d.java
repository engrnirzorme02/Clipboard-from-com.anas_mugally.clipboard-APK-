package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p089L.C0769e;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2556d {

    /* JADX INFO: renamed from: androidx.emoji2.text.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final b f9813a;

        public a(b bVar) {
            this.f9813a = bVar == null ? m11739e() : bVar;
        }

        /* JADX INFO: renamed from: a */
        private C2558f.c m11736a(Context context, C0769e c0769e) {
            if (c0769e == null) {
                return null;
            }
            return new C2563k(context, c0769e);
        }

        /* JADX INFO: renamed from: b */
        private List m11737b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* JADX INFO: renamed from: d */
        private C0769e m11738d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0769e(str, str2, "emojicompat-emoji-font", m11737b(this.f9813a.mo11745b(packageManager, str2)));
        }

        /* JADX INFO: renamed from: e */
        private static b m11739e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* JADX INFO: renamed from: f */
        private boolean m11740f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        private ProviderInfo m11741g(PackageManager packageManager) {
            Iterator it = this.f9813a.mo11746c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo11744a = this.f9813a.mo11744a((ResolveInfo) it.next());
                if (m11740f(providerInfoMo11744a)) {
                    return providerInfoMo11744a;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C2558f.c m11742c(Context context) {
            return m11736a(context, m11743h(context));
        }

        /* JADX INFO: renamed from: h */
        C0769e m11743h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AbstractC0910g.m4140h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM11741g = m11741g(packageManager);
            if (providerInfoM11741g == null) {
                return null;
            }
            try {
                return m11738d(providerInfoM11741g, packageManager);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public abstract ProviderInfo mo11744a(ResolveInfo resolveInfo);

        /* JADX INFO: renamed from: b */
        public Signature[] mo11745b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* JADX INFO: renamed from: c */
        public abstract List mo11746c(PackageManager packageManager, Intent intent, int i7);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$c */
    public static class c extends b {
        @Override // androidx.emoji2.text.AbstractC2556d.b
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo11744a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.AbstractC2556d.b
        /* JADX INFO: renamed from: c */
        public List mo11746c(PackageManager packageManager, Intent intent, int i7) {
            return packageManager.queryIntentContentProviders(intent, i7);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d */
    public static class d extends c {
        @Override // androidx.emoji2.text.AbstractC2556d.b
        /* JADX INFO: renamed from: b */
        public Signature[] mo11745b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2563k m11735a(Context context) {
        return (C2563k) new a(null).m11742c(context);
    }
}
