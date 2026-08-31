package p366u4;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u4.b */
/* JADX INFO: loaded from: classes.dex */
public class C7161b extends Reader {

    /* JADX INFO: renamed from: a */
    private List f28625a;

    /* JADX INFO: renamed from: b */
    private boolean f28626b = false;

    /* JADX INFO: renamed from: c */
    private int f28627c;

    /* JADX INFO: renamed from: e */
    private int f28629e = this.f28627c;

    /* JADX INFO: renamed from: d */
    private int f28628d;

    /* JADX INFO: renamed from: f */
    private int f28630f = this.f28628d;

    /* JADX INFO: renamed from: r */
    private boolean f28631r = false;

    public C7161b() {
        this.f28625a = null;
        this.f28625a = new ArrayList();
    }

    /* JADX INFO: renamed from: J */
    private int m31657J() {
        String strM31660x = m31660x();
        if (strM31660x == null) {
            return 0;
        }
        return strM31660x.length() - this.f28627c;
    }

    /* JADX INFO: renamed from: m */
    private long m31658m(long j7) {
        long j8 = 0;
        while (this.f28628d < this.f28625a.size() && j8 < j7) {
            long j9 = j7 - j8;
            long jM31657J = m31657J();
            if (j9 < jM31657J) {
                this.f28627c = (int) (((long) this.f28627c) + j9);
                j8 += j9;
            } else {
                j8 += jM31657J;
                this.f28627c = 0;
                this.f28628d++;
            }
        }
        return j8;
    }

    /* JADX INFO: renamed from: n */
    private void m31659n() throws IOException {
        if (this.f28626b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f28631r) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    /* JADX INFO: renamed from: x */
    private String m31660x() {
        if (this.f28628d < this.f28625a.size()) {
            return (String) this.f28625a.get(this.f28628d);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public void m31661Q() {
        if (this.f28631r) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.f28631r = true;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m31659n();
        this.f28626b = true;
    }

    /* JADX INFO: renamed from: d */
    public void m31662d(String str) {
        if (this.f28631r) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.f28625a.add(str);
        }
    }

    @Override // java.io.Reader
    public void mark(int i7) throws IOException {
        m31659n();
        this.f28629e = this.f28627c;
        this.f28630f = this.f28628d;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        m31659n();
        int iRemaining = charBuffer.remaining();
        String strM31660x = m31660x();
        int i7 = 0;
        while (iRemaining > 0 && strM31660x != null) {
            int iMin = Math.min(strM31660x.length() - this.f28627c, iRemaining);
            String str = (String) this.f28625a.get(this.f28628d);
            int i8 = this.f28627c;
            charBuffer.put(str, i8, i8 + iMin);
            iRemaining -= iMin;
            i7 += iMin;
            m31658m(iMin);
            strM31660x = m31660x();
        }
        if (i7 > 0 || strM31660x != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        m31659n();
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        this.f28627c = this.f28629e;
        this.f28628d = this.f28630f;
    }

    @Override // java.io.Reader
    public long skip(long j7) throws IOException {
        m31659n();
        return m31658m(j7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f28625a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        m31659n();
        String strM31660x = m31660x();
        if (strM31660x == null) {
            return -1;
        }
        char cCharAt = strM31660x.charAt(this.f28627c);
        m31658m(1L);
        return cCharAt;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i7, int i8) throws IOException {
        m31659n();
        String strM31660x = m31660x();
        int i9 = 0;
        while (strM31660x != null && i9 < i8) {
            int iMin = Math.min(m31657J(), i8 - i9);
            int i10 = this.f28627c;
            strM31660x.getChars(i10, i10 + iMin, cArr, i7 + i9);
            i9 += iMin;
            m31658m(iMin);
            strM31660x = m31660x();
        }
        if (i9 > 0 || strM31660x != null) {
            return i9;
        }
        return -1;
    }
}
