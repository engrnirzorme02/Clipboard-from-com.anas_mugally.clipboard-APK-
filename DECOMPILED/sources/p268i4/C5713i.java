package p268i4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p228d4.C5235g;
import p252g4.AbstractC5499i;

/* JADX INFO: renamed from: i4.i */
/* JADX INFO: loaded from: classes.dex */
class C5713i implements InterfaceC5708d {

    /* JADX INFO: renamed from: d */
    private static final Charset f21803d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final File f21804a;

    /* JADX INFO: renamed from: b */
    private final int f21805b;

    /* JADX INFO: renamed from: c */
    private C5712h f21806c;

    /* JADX INFO: renamed from: i4.i$a */
    class a implements C5712h.d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f21807a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int[] f21808b;

        a(byte[] bArr, int[] iArr) {
            this.f21807a = bArr;
            this.f21808b = iArr;
        }

        @Override // p268i4.C5712h.d
        /* JADX INFO: renamed from: a */
        public void mo25338a(InputStream inputStream, int i7) throws IOException {
            try {
                inputStream.read(this.f21807a, this.f21808b[0], i7);
                int[] iArr = this.f21808b;
                iArr[0] = iArr[0] + i7;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: i4.i$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        public final byte[] f21810a;

        /* JADX INFO: renamed from: b */
        public final int f21811b;

        b(byte[] bArr, int i7) {
            this.f21810a = bArr;
            this.f21811b = i7;
        }
    }

    C5713i(File file, int i7) {
        this.f21804a = file;
        this.f21805b = i7;
    }

    /* JADX INFO: renamed from: f */
    private void m25339f(long j7, String str) {
        if (this.f21806c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i7 = this.f21805b / 4;
            if (str.length() > i7) {
                str = "..." + str.substring(str.length() - i7);
            }
            this.f21806c.m25331J(String.format(Locale.US, "%d %s%n", Long.valueOf(j7), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f21803d));
            while (!this.f21806c.m25337p0() && this.f21806c.m25334Y0() > this.f21805b) {
                this.f21806c.m25333U0();
            }
        } catch (IOException e7) {
            C5235g.m24179f().m24183e("There was a problem writing to the Crashlytics log.", e7);
        }
    }

    /* JADX INFO: renamed from: g */
    private b m25340g() {
        if (!this.f21804a.exists()) {
            return null;
        }
        m25341h();
        C5712h c5712h = this.f21806c;
        if (c5712h == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c5712h.m25334Y0()];
        try {
            this.f21806c.m25336l0(new a(bArr, iArr));
        } catch (IOException e7) {
            C5235g.m24179f().m24183e("A problem occurred while reading the Crashlytics log file.", e7);
        }
        return new b(bArr, iArr[0]);
    }

    /* JADX INFO: renamed from: h */
    private void m25341h() {
        if (this.f21806c == null) {
            try {
                this.f21806c = new C5712h(this.f21804a);
            } catch (IOException e7) {
                C5235g.m24179f().m24183e("Could not open log file: " + this.f21804a, e7);
            }
        }
    }

    @Override // p268i4.InterfaceC5708d
    /* JADX INFO: renamed from: a */
    public void mo25275a() {
        AbstractC5499i.m24788f(this.f21806c, "There was a problem closing the Crashlytics log file.");
        this.f21806c = null;
    }

    @Override // p268i4.InterfaceC5708d
    /* JADX INFO: renamed from: b */
    public String mo25276b() {
        byte[] bArrMo25277c = mo25277c();
        if (bArrMo25277c != null) {
            return new String(bArrMo25277c, f21803d);
        }
        return null;
    }

    @Override // p268i4.InterfaceC5708d
    /* JADX INFO: renamed from: c */
    public byte[] mo25277c() {
        b bVarM25340g = m25340g();
        if (bVarM25340g == null) {
            return null;
        }
        int i7 = bVarM25340g.f21811b;
        byte[] bArr = new byte[i7];
        System.arraycopy(bVarM25340g.f21810a, 0, bArr, 0, i7);
        return bArr;
    }

    @Override // p268i4.InterfaceC5708d
    /* JADX INFO: renamed from: d */
    public void mo25278d() {
        mo25275a();
        this.f21804a.delete();
    }

    @Override // p268i4.InterfaceC5708d
    /* JADX INFO: renamed from: e */
    public void mo25279e(long j7, String str) {
        m25341h();
        m25339f(j7, str);
    }
}
