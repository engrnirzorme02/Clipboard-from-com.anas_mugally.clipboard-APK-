package p026D0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: D0.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0177h extends Closeable {

    /* JADX INFO: renamed from: D0.h$a */
    public static abstract class a {

        /* JADX INFO: renamed from: b */
        public static final C7623a f820b = new C7623a(null);

        /* JADX INFO: renamed from: a */
        public final int f821a;

        /* JADX INFO: renamed from: D0.h$a$a, reason: collision with other inner class name */
        public static final class C7623a {
            public /* synthetic */ C7623a(AbstractC6112h abstractC6112h) {
                this();
            }

            private C7623a() {
            }
        }

        public a(int i7) {
            this.f821a = i7;
        }

        /* JADX INFO: renamed from: a */
        private final void m893a(String str) {
            if (AbstractC6406h.m27564w(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i7 = 0;
            boolean z7 = false;
            while (i7 <= length) {
                boolean z8 = AbstractC6118n.m27188f(str.charAt(!z7 ? i7 : length), 32) <= 0;
                if (z7) {
                    if (!z8) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z8) {
                    i7++;
                } else {
                    z7 = true;
                }
            }
            if (str.subSequence(i7, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                C0171b.m868a(new File(str));
            } catch (Exception e7) {
                Log.w("SupportSQLite", "delete failed: ", e7);
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo894b(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
        }

        /* JADX INFO: renamed from: c */
        public void m895c(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String strMo887q0 = db.mo887q0();
                if (strMo887q0 != null) {
                    m893a(strMo887q0);
                    return;
                }
                return;
            }
            List listMo886q = null;
            try {
                try {
                    listMo886q = db.mo886q();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (listMo886q != null) {
                    return;
                }
            } finally {
                if (listMo886q != null) {
                    Iterator it = listMo886q.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        AbstractC6118n.m27186d(obj, "p.second");
                        m893a((String) obj);
                    }
                } else {
                    String strMo887q1 = db.mo887q0();
                    if (strMo887q1 != null) {
                        m893a(strMo887q1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo896d(InterfaceC0176g interfaceC0176g);

        /* JADX INFO: renamed from: e */
        public abstract void mo897e(InterfaceC0176g interfaceC0176g, int i7, int i8);

        /* JADX INFO: renamed from: f */
        public void mo898f(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo899g(InterfaceC0176g interfaceC0176g, int i7, int i8);
    }

    /* JADX INFO: renamed from: D0.h$b */
    public static final class b {

        /* JADX INFO: renamed from: f */
        public static final C7624b f822f = new C7624b(null);

        /* JADX INFO: renamed from: a */
        public final Context f823a;

        /* JADX INFO: renamed from: b */
        public final String f824b;

        /* JADX INFO: renamed from: c */
        public final a f825c;

        /* JADX INFO: renamed from: d */
        public final boolean f826d;

        /* JADX INFO: renamed from: e */
        public final boolean f827e;

        /* JADX INFO: renamed from: D0.h$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private final Context f828a;

            /* JADX INFO: renamed from: b */
            private String f829b;

            /* JADX INFO: renamed from: c */
            private a f830c;

            /* JADX INFO: renamed from: d */
            private boolean f831d;

            /* JADX INFO: renamed from: e */
            private boolean f832e;

            public a(Context context) {
                AbstractC6118n.m27187e(context, "context");
                this.f828a = context;
            }

            /* JADX INFO: renamed from: a */
            public b m901a() {
                String str;
                a aVar = this.f830c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f831d && ((str = this.f829b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f828a, this.f829b, aVar, this.f831d, this.f832e);
            }

            /* JADX INFO: renamed from: b */
            public a m902b(a callback) {
                AbstractC6118n.m27187e(callback, "callback");
                this.f830c = callback;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m903c(String str) {
                this.f829b = str;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m904d(boolean z7) {
                this.f831d = z7;
                return this;
            }
        }

        /* JADX INFO: renamed from: D0.h$b$b, reason: collision with other inner class name */
        public static final class C7624b {
            public /* synthetic */ C7624b(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m905a(Context context) {
                AbstractC6118n.m27187e(context, "context");
                return new a(context);
            }

            private C7624b() {
            }
        }

        public b(Context context, String str, a callback, boolean z7, boolean z8) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(callback, "callback");
            this.f823a = context;
            this.f824b = str;
            this.f825c = callback;
            this.f826d = z7;
            this.f827e = z8;
        }

        /* JADX INFO: renamed from: a */
        public static final a m900a(Context context) {
            return f822f.m905a(context);
        }
    }

    /* JADX INFO: renamed from: D0.h$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC0177h mo906a(b bVar);
    }

    /* JADX INFO: renamed from: Y */
    InterfaceC0176g mo892Y();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z7);
}
