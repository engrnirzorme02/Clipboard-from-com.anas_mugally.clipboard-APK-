package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C2391b;
import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public class C2558f {

    /* JADX INFO: renamed from: o */
    private static final Object f9816o = new Object();

    /* JADX INFO: renamed from: p */
    private static final Object f9817p = new Object();

    /* JADX INFO: renamed from: q */
    private static volatile C2558f f9818q;

    /* JADX INFO: renamed from: b */
    private final Set f9820b;

    /* JADX INFO: renamed from: e */
    private final b f9823e;

    /* JADX INFO: renamed from: f */
    final h f9824f;

    /* JADX INFO: renamed from: g */
    private final j f9825g;

    /* JADX INFO: renamed from: h */
    final boolean f9826h;

    /* JADX INFO: renamed from: i */
    final boolean f9827i;

    /* JADX INFO: renamed from: j */
    final int[] f9828j;

    /* JADX INFO: renamed from: k */
    private final boolean f9829k;

    /* JADX INFO: renamed from: l */
    private final int f9830l;

    /* JADX INFO: renamed from: m */
    private final int f9831m;

    /* JADX INFO: renamed from: n */
    private final e f9832n;

    /* JADX INFO: renamed from: a */
    private final ReadWriteLock f9819a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    private volatile int f9821c = 3;

    /* JADX INFO: renamed from: d */
    private final Handler f9822d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.f$a */
    private static final class a extends b {

        /* JADX INFO: renamed from: b */
        private volatile C2561i f9833b;

        /* JADX INFO: renamed from: c */
        private volatile C2566n f9834c;

        /* JADX INFO: renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C7664a extends i {
            C7664a() {
            }

            @Override // androidx.emoji2.text.C2558f.i
            /* JADX INFO: renamed from: a */
            public void mo11728a(Throwable th) {
                a.this.f9836a.m11762n(th);
            }

            @Override // androidx.emoji2.text.C2558f.i
            /* JADX INFO: renamed from: b */
            public void mo11729b(C2566n c2566n) {
                a.this.m11774d(c2566n);
            }
        }

        a(C2558f c2558f) {
            super(c2558f);
        }

        @Override // androidx.emoji2.text.C2558f.b
        /* JADX INFO: renamed from: a */
        void mo11771a() {
            try {
                this.f9836a.f9824f.mo11726a(new C7664a());
            } catch (Throwable th) {
                this.f9836a.m11762n(th);
            }
        }

        @Override // androidx.emoji2.text.C2558f.b
        /* JADX INFO: renamed from: b */
        CharSequence mo11772b(CharSequence charSequence, int i7, int i8, int i9, boolean z7) {
            return this.f9833b.m11789h(charSequence, i7, i8, i9, z7);
        }

        @Override // androidx.emoji2.text.C2558f.b
        /* JADX INFO: renamed from: c */
        void mo11773c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f9834c.m11827e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f9836a.f9826h);
        }

        /* JADX INFO: renamed from: d */
        void m11774d(C2566n c2566n) {
            if (c2566n == null) {
                this.f9836a.m11762n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f9834c = c2566n;
            C2566n c2566n2 = this.f9834c;
            j jVar = this.f9836a.f9825g;
            e eVar = this.f9836a.f9832n;
            C2558f c2558f = this.f9836a;
            this.f9833b = new C2561i(c2566n2, jVar, eVar, c2558f.f9827i, c2558f.f9828j, AbstractC2560h.m11778a());
            this.f9836a.m11763o();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final C2558f f9836a;

        b(C2558f c2558f) {
            this.f9836a = c2558f;
        }

        /* JADX INFO: renamed from: a */
        abstract void mo11771a();

        /* JADX INFO: renamed from: b */
        abstract CharSequence mo11772b(CharSequence charSequence, int i7, int i8, int i9, boolean z7);

        /* JADX INFO: renamed from: c */
        abstract void mo11773c(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        final h f9837a;

        /* JADX INFO: renamed from: b */
        j f9838b;

        /* JADX INFO: renamed from: c */
        boolean f9839c;

        /* JADX INFO: renamed from: d */
        boolean f9840d;

        /* JADX INFO: renamed from: e */
        int[] f9841e;

        /* JADX INFO: renamed from: f */
        Set f9842f;

        /* JADX INFO: renamed from: g */
        boolean f9843g;

        /* JADX INFO: renamed from: h */
        int f9844h = -16711936;

        /* JADX INFO: renamed from: i */
        int f9845i = 0;

        /* JADX INFO: renamed from: j */
        e f9846j = new C2557e();

        protected c(h hVar) {
            AbstractC0910g.m4140h(hVar, "metadataLoader cannot be null.");
            this.f9837a = hVar;
        }

        /* JADX INFO: renamed from: a */
        protected final h m11775a() {
            return this.f9837a;
        }

        /* JADX INFO: renamed from: b */
        public c m11776b(int i7) {
            this.f9845i = i7;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$d */
    public static class d implements j {
        @Override // androidx.emoji2.text.C2558f.j
        /* JADX INFO: renamed from: a */
        public AbstractC2562j mo11777a(C2568p c2568p) {
            return new C2569q(c2568p);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo11748a(CharSequence charSequence, int i7, int i8, int i9);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public void mo9883a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public void mo9884b() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$g */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: a */
        private final List f9847a;

        /* JADX INFO: renamed from: b */
        private final Throwable f9848b;

        /* JADX INFO: renamed from: c */
        private final int f9849c;

        g(f fVar, int i7) {
            this(Arrays.asList((f) AbstractC0910g.m4140h(fVar, "initCallback cannot be null")), i7, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9847a.size();
            int i7 = 0;
            if (this.f9849c != 1) {
                while (i7 < size) {
                    ((f) this.f9847a.get(i7)).mo9883a(this.f9848b);
                    i7++;
                }
            } else {
                while (i7 < size) {
                    ((f) this.f9847a.get(i7)).mo9884b();
                    i7++;
                }
            }
        }

        g(Collection collection, int i7) {
            this(collection, i7, null);
        }

        g(Collection collection, int i7, Throwable th) {
            AbstractC0910g.m4140h(collection, "initCallbacks cannot be null");
            this.f9847a = new ArrayList(collection);
            this.f9849c = i7;
            this.f9848b = th;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo11726a(i iVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$i */
    public static abstract class i {
        /* JADX INFO: renamed from: a */
        public abstract void mo11728a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo11729b(C2566n c2566n);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        AbstractC2562j mo11777a(C2568p c2568p);
    }

    private C2558f(c cVar) {
        this.f9826h = cVar.f9839c;
        this.f9827i = cVar.f9840d;
        this.f9828j = cVar.f9841e;
        this.f9829k = cVar.f9843g;
        this.f9830l = cVar.f9844h;
        this.f9824f = cVar.f9837a;
        this.f9831m = cVar.f9845i;
        this.f9832n = cVar.f9846j;
        C2391b c2391b = new C2391b();
        this.f9820b = c2391b;
        j jVar = cVar.f9838b;
        this.f9825g = jVar == null ? new d() : jVar;
        Set set = cVar.f9842f;
        if (set != null && !set.isEmpty()) {
            c2391b.addAll(cVar.f9842f);
        }
        this.f9823e = new a(this);
        m11757m();
    }

    /* JADX INFO: renamed from: c */
    public static C2558f m11751c() {
        C2558f c2558f;
        synchronized (f9816o) {
            c2558f = f9818q;
            AbstractC0910g.m4141i(c2558f != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c2558f;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11752f(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        return C2561i.m11782b(inputConnection, editable, i7, i8, z7);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11753g(Editable editable, int i7, KeyEvent keyEvent) {
        return C2561i.m11783c(editable, i7, keyEvent);
    }

    /* JADX INFO: renamed from: h */
    public static C2558f m11754h(c cVar) {
        C2558f c2558f;
        C2558f c2558f2 = f9818q;
        if (c2558f2 != null) {
            return c2558f2;
        }
        synchronized (f9816o) {
            try {
                c2558f = f9818q;
                if (c2558f == null) {
                    c2558f = new C2558f(cVar);
                    f9818q = c2558f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2558f;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11755i() {
        return f9818q != null;
    }

    /* JADX INFO: renamed from: k */
    private boolean m11756k() {
        return m11759e() == 1;
    }

    /* JADX INFO: renamed from: m */
    private void m11757m() {
        this.f9819a.writeLock().lock();
        try {
            if (this.f9831m == 0) {
                this.f9821c = 0;
            }
            this.f9819a.writeLock().unlock();
            if (m11759e() == 0) {
                this.f9823e.mo11771a();
            }
        } catch (Throwable th) {
            this.f9819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m11758d() {
        return this.f9830l;
    }

    /* JADX INFO: renamed from: e */
    public int m11759e() {
        this.f9819a.readLock().lock();
        try {
            return this.f9821c;
        } finally {
            this.f9819a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m11760j() {
        return this.f9829k;
    }

    /* JADX INFO: renamed from: l */
    public void m11761l() {
        AbstractC0910g.m4141i(this.f9831m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m11756k()) {
            return;
        }
        this.f9819a.writeLock().lock();
        try {
            if (this.f9821c == 0) {
                this.f9819a.writeLock().unlock();
                return;
            }
            this.f9821c = 0;
            this.f9819a.writeLock().unlock();
            this.f9823e.mo11771a();
        } catch (Throwable th) {
            this.f9819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    void m11762n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9819a.writeLock().lock();
        try {
            this.f9821c = 2;
            arrayList.addAll(this.f9820b);
            this.f9820b.clear();
            this.f9819a.writeLock().unlock();
            this.f9822d.post(new g(arrayList, this.f9821c, th));
        } catch (Throwable th2) {
            this.f9819a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    void m11763o() {
        ArrayList arrayList = new ArrayList();
        this.f9819a.writeLock().lock();
        try {
            this.f9821c = 1;
            arrayList.addAll(this.f9820b);
            this.f9820b.clear();
            this.f9819a.writeLock().unlock();
            this.f9822d.post(new g(arrayList, this.f9821c));
        } catch (Throwable th) {
            this.f9819a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m11764p(CharSequence charSequence) {
        return m11765q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m11765q(CharSequence charSequence, int i7, int i8) {
        return m11766r(charSequence, i7, i8, C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m11766r(CharSequence charSequence, int i7, int i8, int i9) {
        return m11767s(charSequence, i7, i8, i9, 0);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m11767s(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        boolean z7;
        AbstractC0910g.m4141i(m11756k(), "Not initialized yet");
        AbstractC0910g.m4137e(i7, "start cannot be negative");
        AbstractC0910g.m4137e(i8, "end cannot be negative");
        AbstractC0910g.m4137e(i9, "maxEmojiCount cannot be negative");
        AbstractC0910g.m4134b(i7 <= i8, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        AbstractC0910g.m4134b(i7 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC0910g.m4134b(i8 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        if (i10 != 1) {
            z7 = i10 != 2 ? this.f9826h : false;
        } else {
            z7 = true;
        }
        return this.f9823e.mo11772b(charSequence, i7, i8, i9, z7);
    }

    /* JADX INFO: renamed from: t */
    public void m11768t(f fVar) {
        AbstractC0910g.m4140h(fVar, "initCallback cannot be null");
        this.f9819a.writeLock().lock();
        try {
            if (this.f9821c == 1 || this.f9821c == 2) {
                this.f9822d.post(new g(fVar, this.f9821c));
            } else {
                this.f9820b.add(fVar);
            }
        } finally {
            this.f9819a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11769u(f fVar) {
        AbstractC0910g.m4140h(fVar, "initCallback cannot be null");
        this.f9819a.writeLock().lock();
        try {
            this.f9820b.remove(fVar);
        } finally {
            this.f9819a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m11770v(EditorInfo editorInfo) {
        if (!m11756k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f9823e.mo11773c(editorInfo);
    }
}
