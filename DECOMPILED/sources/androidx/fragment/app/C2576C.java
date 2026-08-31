package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.C */
/* JADX INFO: loaded from: classes.dex */
final class C2576C extends Writer {

    /* JADX INFO: renamed from: a */
    private final String f10011a;

    /* JADX INFO: renamed from: b */
    private StringBuilder f10012b = new StringBuilder(128);

    C2576C(String str) {
        this.f10011a = str;
    }

    /* JADX INFO: renamed from: d */
    private void m11964d() {
        if (this.f10012b.length() > 0) {
            Log.d(this.f10011a, this.f10012b.toString());
            StringBuilder sb = this.f10012b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m11964d();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m11964d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                m11964d();
            } else {
                this.f10012b.append(c7);
            }
        }
    }
}
