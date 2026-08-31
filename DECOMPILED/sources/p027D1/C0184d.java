package p027D1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.C3222g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p019C1.EnumC0125a;

/* JADX INFO: renamed from: D1.d */
/* JADX INFO: loaded from: classes.dex */
public class C0184d implements InterfaceC3219d {

    /* JADX INFO: renamed from: a */
    private final Uri f833a;

    /* JADX INFO: renamed from: b */
    private final C0186f f834b;

    /* JADX INFO: renamed from: c */
    private InputStream f835c;

    /* JADX INFO: renamed from: D1.d$a */
    static class a implements InterfaceC0185e {

        /* JADX INFO: renamed from: b */
        private static final String[] f836b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f837a;

        a(ContentResolver contentResolver) {
            this.f837a = contentResolver;
        }

        @Override // p027D1.InterfaceC0185e
        /* JADX INFO: renamed from: a */
        public Cursor mo934a(Uri uri) {
            return this.f837a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f836b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: D1.d$b */
    static class b implements InterfaceC0185e {

        /* JADX INFO: renamed from: b */
        private static final String[] f838b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f839a;

        b(ContentResolver contentResolver) {
            this.f839a = contentResolver;
        }

        @Override // p027D1.InterfaceC0185e
        /* JADX INFO: renamed from: a */
        public Cursor mo934a(Uri uri) {
            return this.f839a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f838b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C0184d(Uri uri, C0186f c0186f) {
        this.f833a = uri;
        this.f834b = c0186f;
    }

    /* JADX INFO: renamed from: c */
    private static C0184d m926c(Context context, Uri uri, InterfaceC0185e interfaceC0185e) {
        return new C0184d(uri, new C0186f(ComponentCallbacks2C3202b.m16988c(context).m17002j().m17031g(), interfaceC0185e, ComponentCallbacks2C3202b.m16988c(context).m16997e(), context.getContentResolver()));
    }

    /* JADX INFO: renamed from: f */
    public static C0184d m927f(Context context, Uri uri) {
        return m926c(context, uri, new a(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: g */
    public static C0184d m928g(Context context, Uri uri) {
        return m926c(context, uri, new b(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: h */
    private InputStream m929h() throws Throwable {
        InputStream inputStreamM938d = this.f834b.m938d(this.f833a);
        int iM937a = inputStreamM938d != null ? this.f834b.m937a(this.f833a) : -1;
        return iM937a != -1 ? new C3222g(inputStreamM938d, iM937a) : inputStreamM938d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: b */
    public void mo931b() {
        InputStream inputStream = this.f835c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM929h = m929h();
            this.f835c = inputStreamM929h;
            aVar.mo1314f(inputStreamM929h);
        } catch (FileNotFoundException e7) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e7);
            }
            aVar.mo1313c(e7);
        }
    }
}
