package p043F1;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: F1.j */
/* JADX INFO: loaded from: classes.dex */
public class C0412j implements InterfaceC0406d {

    /* JADX INFO: renamed from: k */
    private static final Bitmap.Config f1636k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0413k f1637a;

    /* JADX INFO: renamed from: b */
    private final Set f1638b;

    /* JADX INFO: renamed from: c */
    private final long f1639c;

    /* JADX INFO: renamed from: d */
    private final a f1640d;

    /* JADX INFO: renamed from: e */
    private long f1641e;

    /* JADX INFO: renamed from: f */
    private long f1642f;

    /* JADX INFO: renamed from: g */
    private int f1643g;

    /* JADX INFO: renamed from: h */
    private int f1644h;

    /* JADX INFO: renamed from: i */
    private int f1645i;

    /* JADX INFO: renamed from: j */
    private int f1646j;

    /* JADX INFO: renamed from: F1.j$a */
    private interface a {
        /* JADX INFO: renamed from: a */
        void mo1789a(Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo1790b(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: F1.j$b */
    private static final class b implements a {
        b() {
        }

        @Override // p043F1.C0412j.a
        /* JADX INFO: renamed from: a */
        public void mo1789a(Bitmap bitmap) {
        }

        @Override // p043F1.C0412j.a
        /* JADX INFO: renamed from: b */
        public void mo1790b(Bitmap bitmap) {
        }
    }

    C0412j(long j7, InterfaceC0413k interfaceC0413k, Set set) {
        this.f1639c = j7;
        this.f1641e = j7;
        this.f1637a = interfaceC0413k;
        this.f1638b = set;
        this.f1640d = new b();
    }

    /* JADX INFO: renamed from: f */
    private static void m1777f(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    /* JADX INFO: renamed from: g */
    private static Bitmap m1778g(int i7, int i8, Bitmap.Config config) {
        if (config == null) {
            config = f1636k;
        }
        return Bitmap.createBitmap(i7, i8, config);
    }

    /* JADX INFO: renamed from: h */
    private void m1779h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m1780i();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1780i() {
        Log.v("LruBitmapPool", "Hits=" + this.f1643g + ", misses=" + this.f1644h + ", puts=" + this.f1645i + ", evictions=" + this.f1646j + ", currentSize=" + this.f1642f + ", maxSize=" + this.f1641e + "\nStrategy=" + this.f1637a);
    }

    /* JADX INFO: renamed from: j */
    private void m1781j() {
        m1787q(this.f1641e);
    }

    /* JADX INFO: renamed from: k */
    private static Set m1782k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: l */
    private static InterfaceC0413k m1783l() {
        return new C0415m();
    }

    /* JADX INFO: renamed from: m */
    private synchronized Bitmap m1784m(int i7, int i8, Bitmap.Config config) {
        Bitmap bitmapMo1794d;
        try {
            m1777f(config);
            bitmapMo1794d = this.f1637a.mo1794d(i7, i8, config != null ? config : f1636k);
            if (bitmapMo1794d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f1637a.mo1791a(i7, i8, config));
                }
                this.f1644h++;
            } else {
                this.f1643g++;
                this.f1642f -= (long) this.f1637a.mo1792b(bitmapMo1794d);
                this.f1640d.mo1789a(bitmapMo1794d);
                m1786p(bitmapMo1794d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f1637a.mo1791a(i7, i8, config));
            }
            m1779h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo1794d;
    }

    /* JADX INFO: renamed from: o */
    private static void m1785o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* JADX INFO: renamed from: p */
    private static void m1786p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m1785o(bitmap);
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m1787q(long j7) {
        while (this.f1642f > j7) {
            try {
                Bitmap bitmapRemoveLast = this.f1637a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m1780i();
                    }
                    this.f1642f = 0L;
                    return;
                }
                this.f1640d.mo1789a(bitmapRemoveLast);
                this.f1642f -= (long) this.f1637a.mo1792b(bitmapRemoveLast);
                this.f1646j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f1637a.mo1795e(bitmapRemoveLast));
                }
                m1779h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: a */
    public void mo1743a(int i7) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i7);
        }
        if (i7 >= 40 || i7 >= 20) {
            mo1744b();
        } else if (i7 >= 20 || i7 == 15) {
            m1787q(m1788n() / 2);
        }
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: b */
    public void mo1744b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m1787q(0L);
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: c */
    public synchronized void mo1745c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f1637a.mo1792b(bitmap) <= this.f1641e && this.f1638b.contains(bitmap.getConfig())) {
                int iMo1792b = this.f1637a.mo1792b(bitmap);
                this.f1637a.mo1793c(bitmap);
                this.f1640d.mo1790b(bitmap);
                this.f1645i++;
                this.f1642f += (long) iMo1792b;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f1637a.mo1795e(bitmap));
                }
                m1779h();
                m1781j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f1637a.mo1795e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f1638b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: d */
    public Bitmap mo1746d(int i7, int i8, Bitmap.Config config) {
        Bitmap bitmapM1784m = m1784m(i7, i8, config);
        if (bitmapM1784m == null) {
            return m1778g(i7, i8, config);
        }
        bitmapM1784m.eraseColor(0);
        return bitmapM1784m;
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: e */
    public Bitmap mo1747e(int i7, int i8, Bitmap.Config config) {
        Bitmap bitmapM1784m = m1784m(i7, i8, config);
        return bitmapM1784m == null ? m1778g(i7, i8, config) : bitmapM1784m;
    }

    /* JADX INFO: renamed from: n */
    public long m1788n() {
        return this.f1641e;
    }

    public C0412j(long j7) {
        this(j7, m1783l(), m1782k());
    }
}
