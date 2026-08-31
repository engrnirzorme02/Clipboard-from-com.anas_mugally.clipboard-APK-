package p089L;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C2399j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p025D.AbstractC0162e;
import p033E.AbstractC0264s;
import p066I0.AbstractC0578a;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0768d {

    /* JADX INFO: renamed from: a */
    private static final C2399j f3114a = new C2399j(2);

    /* JADX INFO: renamed from: b */
    private static final Comparator f3115b = new Comparator() { // from class: L.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC0768d.m3603a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: L.d$a */
    private interface a {
        /* JADX INFO: renamed from: a */
        static a m3610a(Context context, Uri uri) {
            return new b(context, uri);
        }

        /* JADX INFO: renamed from: b */
        Cursor mo3611b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: renamed from: L.d$b */
    private static class b implements a {

        /* JADX INFO: renamed from: a */
        private final ContentProviderClient f3116a;

        b(Context context, Uri uri) {
            this.f3116a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p089L.AbstractC0768d.a
        /* JADX INFO: renamed from: b */
        public Cursor mo3611b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f3116a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e7) {
                Log.w("FontsProvider", "Unable to query the content provider", e7);
                return null;
            }
        }

        @Override // p089L.AbstractC0768d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f3116a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: renamed from: L.d$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        String f3117a;

        /* JADX INFO: renamed from: b */
        String f3118b;

        /* JADX INFO: renamed from: c */
        List f3119c;

        c(String str, String str2, List list) {
            this.f3117a = str;
            this.f3118b = str2;
            this.f3119c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f3117a, cVar.f3117a) && Objects.equals(this.f3118b, cVar.f3118b) && Objects.equals(this.f3119c, cVar.f3119c);
        }

        public int hashCode() {
            return Objects.hash(this.f3117a, this.f3118b, this.f3119c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3603a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private static List m3604b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3605c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static List m3606d(C0769e c0769e, Resources resources) {
        return c0769e.m3613b() != null ? c0769e.m3613b() : AbstractC0162e.m783c(resources, c0769e.m3614c());
    }

    /* JADX INFO: renamed from: e */
    static AbstractC0776l.a m3607e(Context context, List list, CancellationSignal cancellationSignal) {
        String strM3619h;
        Typeface typefaceM1231h;
        AbstractC0578a.m2543a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0769e c0769e = (C0769e) list.get(i7);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM1231h = AbstractC0264s.m1231h((strM3619h = c0769e.m3619h()))) == null || AbstractC0264s.m1233j(typefaceM1231h) == null) {
                    ProviderInfo providerInfoM3608f = m3608f(context.getPackageManager(), c0769e, context.getResources());
                    if (providerInfoM3608f == null) {
                        return AbstractC0776l.a.m3640b(1, null);
                    }
                    arrayList.add(m3609g(context, c0769e, providerInfoM3608f.authority, cancellationSignal));
                } else {
                    arrayList.add(new AbstractC0776l.b[]{new AbstractC0776l.b(strM3619h, c0769e.m3620i())});
                }
            }
            return AbstractC0776l.a.m3639a(0, arrayList);
        } finally {
            AbstractC0578a.m2544b();
        }
    }

    /* JADX INFO: renamed from: f */
    static ProviderInfo m3608f(PackageManager packageManager, C0769e c0769e, Resources resources) {
        AbstractC0578a.m2543a("FontProvider.getProvider");
        try {
            List listM3606d = m3606d(c0769e, resources);
            c cVar = new c(c0769e.m3616e(), c0769e.m3617f(), listM3606d);
            ProviderInfo providerInfo = (ProviderInfo) f3114a.get(cVar);
            if (providerInfo != null) {
                AbstractC0578a.m2544b();
                return providerInfo;
            }
            String strM3616e = c0769e.m3616e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM3616e, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strM3616e);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(c0769e.m3617f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strM3616e + ", but package was not " + c0769e.m3617f());
            }
            List listM3604b = m3604b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listM3604b, f3115b);
            for (int i7 = 0; i7 < listM3606d.size(); i7++) {
                ArrayList arrayList = new ArrayList((Collection) listM3606d.get(i7));
                Collections.sort(arrayList, f3115b);
                if (m3605c(listM3604b, arrayList)) {
                    f3114a.put(cVar, providerInfoResolveContentProvider);
                    AbstractC0578a.m2544b();
                    return providerInfoResolveContentProvider;
                }
            }
            AbstractC0578a.m2544b();
            return null;
        } catch (Throwable th) {
            AbstractC0578a.m2544b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [L.d$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX INFO: renamed from: g */
    static AbstractC0776l.b[] m3609g(Context context, C0769e c0769e, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z7;
        AbstractC0578a.m2543a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarM3610a = a.m3610a(context, uriBuild);
            Cursor cursorMo3611b = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0578a.m2543a("ContentQueryWrapper.query");
                try {
                    try {
                        cursorMo3611b = aVarM3610a.mo3611b(uriBuild, strArr, "query = ?", new String[]{c0769e.m3618g()}, null, cancellationSignal);
                        AbstractC0578a.m2544b();
                        if (cursorMo3611b == null || cursorMo3611b.getCount() <= 0) {
                            aVar = aVarM3610a;
                        } else {
                            int columnIndex = cursorMo3611b.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorMo3611b.getColumnIndex("_id");
                            int columnIndex3 = cursorMo3611b.getColumnIndex("file_id");
                            int columnIndex4 = cursorMo3611b.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorMo3611b.getColumnIndex("font_weight");
                            int columnIndex6 = cursorMo3611b.getColumnIndex("font_italic");
                            while (cursorMo3611b.moveToNext()) {
                                int i7 = columnIndex != -1 ? cursorMo3611b.getInt(columnIndex) : 0;
                                int i8 = columnIndex4 != -1 ? cursorMo3611b.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo3611b.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo3611b.getLong(columnIndex3));
                                int i9 = columnIndex5 != -1 ? cursorMo3611b.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z7 = true;
                                    if (cursorMo3611b.getInt(columnIndex6) != 1) {
                                        z7 = false;
                                    }
                                } else {
                                    z7 = false;
                                }
                                arrayList2.add(AbstractC0776l.b.m3645a(uriWithAppendedId, i8, i9, z7, i7));
                                aVarM3610a = aVarM3610a;
                            }
                            aVar = aVarM3610a;
                            arrayList = arrayList2;
                        }
                        if (cursorMo3611b != null) {
                            cursorMo3611b.close();
                        }
                        aVar.close();
                        return (AbstractC0776l.b[]) arrayList.toArray(new AbstractC0776l.b[0]);
                    } finally {
                        AbstractC0578a.m2544b();
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursorMo3611b != null) {
                        cursorMo3611b.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = aVarM3610a;
            }
        } catch (Throwable th3) {
            AbstractC0578a.m2544b();
            throw th3;
        }
    }
}
