package p067I1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.io.FileNotFoundException;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p027D1.AbstractC0183c;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0592l implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2263a;

    /* JADX INFO: renamed from: I1.l$a */
    public static final class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2264a;

        public a(Context context) {
            this.f2264a = context;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0592l(this.f2264a);
        }
    }

    /* JADX INFO: renamed from: I1.l$b */
    private static class b implements InterfaceC3219d {

        /* JADX INFO: renamed from: c */
        private static final String[] f2265c = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f2266a;

        /* JADX INFO: renamed from: b */
        private final Uri f2267b;

        b(Context context, Uri uri) {
            this.f2266a = context;
            this.f2267b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: d */
        public EnumC0125a mo932d() {
            return EnumC0125a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: e */
        public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
            Cursor cursorQuery = this.f2266a.getContentResolver().query(this.f2267b, f2265c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo1314f(new File(string));
                return;
            }
            aVar.mo1313c(new FileNotFoundException("Failed to find file path for: " + this.f2267b));
        }
    }

    public C0592l(Context context) {
        this.f2263a = context;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(uri), new b(this.f2263a, uri));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return AbstractC0183c.m921d(uri);
    }
}
