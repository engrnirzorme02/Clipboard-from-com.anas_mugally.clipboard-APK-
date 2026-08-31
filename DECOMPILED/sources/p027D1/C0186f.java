package p027D1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC3214a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p043F1.InterfaceC0404b;

/* JADX INFO: renamed from: D1.f */
/* JADX INFO: loaded from: classes.dex */
class C0186f {

    /* JADX INFO: renamed from: f */
    private static final C0181a f840f = new C0181a();

    /* JADX INFO: renamed from: a */
    private final C0181a f841a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0185e f842b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0404b f843c;

    /* JADX INFO: renamed from: d */
    private final ContentResolver f844d;

    /* JADX INFO: renamed from: e */
    private final List f845e;

    C0186f(List list, InterfaceC0185e interfaceC0185e, InterfaceC0404b interfaceC0404b, ContentResolver contentResolver) {
        this(list, f840f, interfaceC0185e, interfaceC0404b, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x001b */
    /* JADX INFO: renamed from: b */
    private String m935b(Uri uri) throws Throwable {
        Cursor cursorMo934a;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorMo934a = this.f842b.mo934a(uri);
                if (cursorMo934a != null) {
                    try {
                        if (cursorMo934a.moveToFirst()) {
                            String string = cursorMo934a.getString(0);
                            cursorMo934a.close();
                            return string;
                        }
                    } catch (SecurityException e7) {
                        e = e7;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo934a != null) {
                            cursorMo934a.close();
                        }
                        return null;
                    }
                }
                if (cursorMo934a != null) {
                    cursorMo934a.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e8) {
            e = e8;
            cursorMo934a = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m936c(File file) {
        return this.f841a.m914a(file) && 0 < this.f841a.m916c(file);
    }

    /* JADX INFO: renamed from: a */
    int m937a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f844d.openInputStream(uri);
                return AbstractC3214a.m17088b(this.f845e, inputStreamOpenInputStream, this.f843c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e7) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e7);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public InputStream m938d(Uri uri) throws Throwable {
        String strM935b = m935b(uri);
        if (TextUtils.isEmpty(strM935b)) {
            return null;
        }
        File fileM915b = this.f841a.m915b(strM935b);
        if (!m936c(fileM915b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM915b);
        try {
            return this.f844d.openInputStream(uriFromFile);
        } catch (NullPointerException e7) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e7));
        }
    }

    C0186f(List list, C0181a c0181a, InterfaceC0185e interfaceC0185e, InterfaceC0404b interfaceC0404b, ContentResolver contentResolver) {
        this.f841a = c0181a;
        this.f842b = interfaceC0185e;
        this.f843c = interfaceC0404b;
        this.f844d = contentResolver;
        this.f845e = list;
    }
}
