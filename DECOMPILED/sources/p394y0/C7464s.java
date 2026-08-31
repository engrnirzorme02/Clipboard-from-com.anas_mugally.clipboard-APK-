package p394y0;

import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.C0170a;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p220c6.AbstractC3026b;
import p402z0.AbstractC7558a;

/* JADX INFO: renamed from: y0.s */
/* JADX INFO: loaded from: classes.dex */
public class C7464s extends InterfaceC0177h.a {

    /* JADX INFO: renamed from: g */
    public static final a f29964g = new a(null);

    /* JADX INFO: renamed from: c */
    private C7451f f29965c;

    /* JADX INFO: renamed from: d */
    private final b f29966d;

    /* JADX INFO: renamed from: e */
    private final String f29967e;

    /* JADX INFO: renamed from: f */
    private final String f29968f;

    /* JADX INFO: renamed from: y0.s$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m33067a(InterfaceC0176g db) throws IOException {
            AbstractC6118n.m27187e(db, "db");
            Cursor cursorMo881a0 = db.mo881a0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z7 = false;
                if (cursorMo881a0.moveToFirst() && cursorMo881a0.getInt(0) == 0) {
                    z7 = true;
                }
                AbstractC3026b.m14999a(cursorMo881a0, null);
                return z7;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(cursorMo881a0, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m33068b(InterfaceC0176g db) throws IOException {
            AbstractC6118n.m27187e(db, "db");
            Cursor cursorMo881a0 = db.mo881a0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z7 = false;
                if (cursorMo881a0.moveToFirst() && cursorMo881a0.getInt(0) != 0) {
                    z7 = true;
                }
                AbstractC3026b.m14999a(cursorMo881a0, null);
                return z7;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(cursorMo881a0, th);
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y0.s$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public final int f29969a;

        public b(int i7) {
            this.f29969a = i7;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo14534a(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: b */
        public abstract void mo14535b(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: c */
        public abstract void mo14536c(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: d */
        public abstract void mo14537d(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: e */
        public abstract void mo14538e(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: f */
        public abstract void mo14539f(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: g */
        public abstract c mo14540g(InterfaceC0176g interfaceC0176g);
    }

    /* JADX INFO: renamed from: y0.s$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final boolean f29970a;

        /* JADX INFO: renamed from: b */
        public final String f29971b;

        public c(boolean z7, String str) {
            this.f29970a = z7;
            this.f29971b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7464s(C7451f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f29969a);
        AbstractC6118n.m27187e(configuration, "configuration");
        AbstractC6118n.m27187e(delegate, "delegate");
        AbstractC6118n.m27187e(identityHash, "identityHash");
        AbstractC6118n.m27187e(legacyHash, "legacyHash");
        this.f29965c = configuration;
        this.f29966d = delegate;
        this.f29967e = identityHash;
        this.f29968f = legacyHash;
    }

    /* JADX INFO: renamed from: h */
    private final void m33064h(InterfaceC0176g interfaceC0176g) throws IOException {
        if (!f29964g.m33068b(interfaceC0176g)) {
            c cVarMo14540g = this.f29966d.mo14540g(interfaceC0176g);
            if (cVarMo14540g.f29970a) {
                this.f29966d.mo14538e(interfaceC0176g);
                m33066j(interfaceC0176g);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarMo14540g.f29971b);
            }
        }
        Cursor cursorMo884i0 = interfaceC0176g.mo884i0(new C0170a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorMo884i0.moveToFirst() ? cursorMo884i0.getString(0) : null;
            AbstractC3026b.m14999a(cursorMo884i0, null);
            if (AbstractC6118n.m27183a(this.f29967e, string) || AbstractC6118n.m27183a(this.f29968f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f29967e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(cursorMo884i0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m33065i(InterfaceC0176g interfaceC0176g) {
        interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* JADX INFO: renamed from: j */
    private final void m33066j(InterfaceC0176g interfaceC0176g) {
        m33065i(interfaceC0176g);
        interfaceC0176g.mo888s(C7463r.m33063a(this.f29967e));
    }

    @Override // p026D0.InterfaceC0177h.a
    /* JADX INFO: renamed from: b */
    public void mo894b(InterfaceC0176g db) {
        AbstractC6118n.m27187e(db, "db");
        super.mo894b(db);
    }

    @Override // p026D0.InterfaceC0177h.a
    /* JADX INFO: renamed from: d */
    public void mo896d(InterfaceC0176g db) throws IOException {
        AbstractC6118n.m27187e(db, "db");
        boolean zM33067a = f29964g.m33067a(db);
        this.f29966d.mo14534a(db);
        if (!zM33067a) {
            c cVarMo14540g = this.f29966d.mo14540g(db);
            if (!cVarMo14540g.f29970a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarMo14540g.f29971b);
            }
        }
        m33066j(db);
        this.f29966d.mo14536c(db);
    }

    @Override // p026D0.InterfaceC0177h.a
    /* JADX INFO: renamed from: e */
    public void mo897e(InterfaceC0176g db, int i7, int i8) {
        AbstractC6118n.m27187e(db, "db");
        mo899g(db, i7, i8);
    }

    @Override // p026D0.InterfaceC0177h.a
    /* JADX INFO: renamed from: f */
    public void mo898f(InterfaceC0176g db) throws IOException {
        AbstractC6118n.m27187e(db, "db");
        super.mo898f(db);
        m33064h(db);
        this.f29966d.mo14537d(db);
        this.f29965c = null;
    }

    @Override // p026D0.InterfaceC0177h.a
    /* JADX INFO: renamed from: g */
    public void mo899g(InterfaceC0176g db, int i7, int i8) {
        List listM33059d;
        AbstractC6118n.m27187e(db, "db");
        C7451f c7451f = this.f29965c;
        if (c7451f == null || (listM33059d = c7451f.f29892d.m33059d(i7, i8)) == null) {
            C7451f c7451f2 = this.f29965c;
            if (c7451f2 != null && !c7451f2.m33012a(i7, i8)) {
                this.f29966d.mo14535b(db);
                this.f29966d.mo14534a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f29966d.mo14539f(db);
        Iterator it = listM33059d.iterator();
        while (it.hasNext()) {
            ((AbstractC7558a) it.next()).mo14541a(db);
        }
        c cVarMo14540g = this.f29966d.mo14540g(db);
        if (cVarMo14540g.f29970a) {
            this.f29966d.mo14538e(db);
            m33066j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarMo14540g.f29971b);
        }
    }
}
