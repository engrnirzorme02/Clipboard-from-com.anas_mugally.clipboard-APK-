package p394y0;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p026D0.C0172c;
import p026D0.C0174e;
import p026D0.C0175f;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p026D0.InterfaceC0179j;
import p026D0.InterfaceC0180k;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7449d implements InterfaceC0177h, InterfaceC7452g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0177h f29866a;

    /* JADX INFO: renamed from: b */
    public final C7448c f29867b;

    /* JADX INFO: renamed from: c */
    private final a f29868c;

    /* JADX INFO: renamed from: y0.d$a */
    public static final class a implements InterfaceC0176g {

        /* JADX INFO: renamed from: a */
        private final C7448c f29869a;

        /* JADX INFO: renamed from: y0.d$a$a, reason: collision with other inner class name */
        static final class C7730a extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final C7730a f29870a = new C7730a();

            C7730a() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(InterfaceC0176g obj) {
                AbstractC6118n.m27187e(obj, "obj");
                return obj.mo886q();
            }
        }

        /* JADX INFO: renamed from: y0.d$a$b */
        static final class b extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f29871a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f29871a = str;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0176g db) {
                AbstractC6118n.m27187e(db, "db");
                db.mo888s(this.f29871a);
                return null;
            }
        }

        /* JADX INFO: renamed from: y0.d$a$c */
        static final class c extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f29872a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object[] f29873b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f29872a = str;
                this.f29873b = objArr;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0176g db) {
                AbstractC6118n.m27187e(db, "db");
                db.mo879S(this.f29872a, this.f29873b);
                return null;
            }
        }

        /* JADX INFO: renamed from: y0.d$a$d */
        /* synthetic */ class d extends AbstractC6116l implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final d f29874a = new d();

            d() {
                super(1, InterfaceC0176g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC0176g p7) {
                AbstractC6118n.m27187e(p7, "p0");
                return Boolean.valueOf(p7.mo889t0());
            }
        }

        /* JADX INFO: renamed from: y0.d$a$e */
        static final class e extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final e f29875a = new e();

            e() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC0176g db) {
                AbstractC6118n.m27187e(db, "db");
                return Boolean.valueOf(db.mo890y0());
            }
        }

        /* JADX INFO: renamed from: y0.d$a$f */
        static final class f extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final f f29876a = new f();

            f() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(InterfaceC0176g obj) {
                AbstractC6118n.m27187e(obj, "obj");
                return obj.mo887q0();
            }
        }

        /* JADX INFO: renamed from: y0.d$a$g */
        static final class g extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final g f29877a = new g();

            g() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0176g it) {
                AbstractC6118n.m27187e(it, "it");
                return null;
            }
        }

        public a(C7448c autoCloser) {
            AbstractC6118n.m27187e(autoCloser, "autoCloser");
            this.f29869a = autoCloser;
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: A0 */
        public Cursor mo878A0(InterfaceC0179j query, CancellationSignal cancellationSignal) {
            AbstractC6118n.m27187e(query, "query");
            try {
                return new c(this.f29869a.m32990j().mo878A0(query, cancellationSignal), this.f29869a);
            } catch (Throwable th) {
                this.f29869a.m32986e();
                throw th;
            }
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: S */
        public void mo879S(String sql, Object[] bindArgs) {
            AbstractC6118n.m27187e(sql, "sql");
            AbstractC6118n.m27187e(bindArgs, "bindArgs");
            this.f29869a.m32987g(new c(sql, bindArgs));
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: T */
        public void mo880T() {
            try {
                this.f29869a.m32990j().mo880T();
            } catch (Throwable th) {
                this.f29869a.m32986e();
                throw th;
            }
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: a0 */
        public Cursor mo881a0(String query) {
            AbstractC6118n.m27187e(query, "query");
            try {
                return new c(this.f29869a.m32990j().mo881a0(query), this.f29869a);
            } catch (Throwable th) {
                this.f29869a.m32986e();
                throw th;
            }
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: c */
        public void mo882c() {
            try {
                this.f29869a.m32990j().mo882c();
            } catch (Throwable th) {
                this.f29869a.m32986e();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29869a.m32985d();
        }

        /* JADX INFO: renamed from: d */
        public final void m32995d() {
            this.f29869a.m32987g(g.f29877a);
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: h */
        public void mo883h() {
            C1444v c1444v;
            InterfaceC0176g interfaceC0176gM32988h = this.f29869a.m32988h();
            if (interfaceC0176gM32988h != null) {
                interfaceC0176gM32988h.mo883h();
                c1444v = C1444v.f4971a;
            } else {
                c1444v = null;
            }
            if (c1444v == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: i0 */
        public Cursor mo884i0(InterfaceC0179j query) {
            AbstractC6118n.m27187e(query, "query");
            try {
                return new c(this.f29869a.m32990j().mo884i0(query), this.f29869a);
            } catch (Throwable th) {
                this.f29869a.m32986e();
                throw th;
            }
        }

        @Override // p026D0.InterfaceC0176g
        public boolean isOpen() {
            InterfaceC0176g interfaceC0176gM32988h = this.f29869a.m32988h();
            if (interfaceC0176gM32988h == null) {
                return false;
            }
            return interfaceC0176gM32988h.isOpen();
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: j */
        public void mo885j() {
            if (this.f29869a.m32988h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                InterfaceC0176g interfaceC0176gM32988h = this.f29869a.m32988h();
                AbstractC6118n.m27184b(interfaceC0176gM32988h);
                interfaceC0176gM32988h.mo885j();
            } finally {
                this.f29869a.m32986e();
            }
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: q */
        public List mo886q() {
            return (List) this.f29869a.m32987g(C7730a.f29870a);
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: q0 */
        public String mo887q0() {
            return (String) this.f29869a.m32987g(f.f29876a);
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: s */
        public void mo888s(String sql) {
            AbstractC6118n.m27187e(sql, "sql");
            this.f29869a.m32987g(new b(sql));
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: t0 */
        public boolean mo889t0() {
            if (this.f29869a.m32988h() == null) {
                return false;
            }
            return ((Boolean) this.f29869a.m32987g(d.f29874a)).booleanValue();
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: y0 */
        public boolean mo890y0() {
            return ((Boolean) this.f29869a.m32987g(e.f29875a)).booleanValue();
        }

        @Override // p026D0.InterfaceC0176g
        /* JADX INFO: renamed from: z */
        public InterfaceC0180k mo891z(String sql) {
            AbstractC6118n.m27187e(sql, "sql");
            return new b(sql, this.f29869a);
        }
    }

    /* JADX INFO: renamed from: y0.d$b */
    private static final class b implements InterfaceC0180k {

        /* JADX INFO: renamed from: a */
        private final String f29878a;

        /* JADX INFO: renamed from: b */
        private final C7448c f29879b;

        /* JADX INFO: renamed from: c */
        private final ArrayList f29880c;

        /* JADX INFO: renamed from: y0.d$b$a */
        static final class a extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final a f29881a = new a();

            a() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(InterfaceC0180k obj) {
                AbstractC6118n.m27187e(obj, "obj");
                return Long.valueOf(obj.mo912J0());
            }
        }

        /* JADX INFO: renamed from: y0.d$b$b, reason: collision with other inner class name */
        static final class C7731b extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC5367l f29883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7731b(InterfaceC5367l interfaceC5367l) {
                super(1);
                this.f29883b = interfaceC5367l;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0176g db) {
                AbstractC6118n.m27187e(db, "db");
                InterfaceC0180k interfaceC0180kMo891z = db.mo891z(b.this.f29878a);
                b.this.m33006n(interfaceC0180kMo891z);
                return this.f29883b.invoke(interfaceC0180kMo891z);
            }
        }

        /* JADX INFO: renamed from: y0.d$b$c */
        static final class c extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            public static final c f29884a = new c();

            c() {
                super(1);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(InterfaceC0180k obj) {
                AbstractC6118n.m27187e(obj, "obj");
                return Integer.valueOf(obj.mo913y());
            }
        }

        public b(String sql, C7448c autoCloser) {
            AbstractC6118n.m27187e(sql, "sql");
            AbstractC6118n.m27187e(autoCloser, "autoCloser");
            this.f29878a = sql;
            this.f29879b = autoCloser;
            this.f29880c = new ArrayList();
        }

        /* JADX INFO: renamed from: J */
        private final void m33003J(int i7, Object obj) {
            int size;
            int i8 = i7 - 1;
            if (i8 >= this.f29880c.size() && (size = this.f29880c.size()) <= i8) {
                while (true) {
                    this.f29880c.add(null);
                    if (size == i8) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f29880c.set(i8, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public final void m33006n(InterfaceC0180k interfaceC0180k) {
            Iterator it = this.f29880c.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1638q.m6773r();
                }
                Object obj = this.f29880c.get(i7);
                if (obj == null) {
                    interfaceC0180k.mo910m0(i8);
                } else if (obj instanceof Long) {
                    interfaceC0180k.mo908R(i8, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC0180k.mo907D(i8, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC0180k.mo911t(i8, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC0180k.mo909V(i8, (byte[]) obj);
                }
                i7 = i8;
            }
        }

        /* JADX INFO: renamed from: x */
        private final Object m33007x(InterfaceC5367l interfaceC5367l) {
            return this.f29879b.m32987g(new C7731b(interfaceC5367l));
        }

        @Override // p026D0.InterfaceC0178i
        /* JADX INFO: renamed from: D */
        public void mo907D(int i7, double d7) {
            m33003J(i7, Double.valueOf(d7));
        }

        @Override // p026D0.InterfaceC0180k
        /* JADX INFO: renamed from: J0 */
        public long mo912J0() {
            return ((Number) m33007x(a.f29881a)).longValue();
        }

        @Override // p026D0.InterfaceC0178i
        /* JADX INFO: renamed from: R */
        public void mo908R(int i7, long j7) {
            m33003J(i7, Long.valueOf(j7));
        }

        @Override // p026D0.InterfaceC0178i
        /* JADX INFO: renamed from: V */
        public void mo909V(int i7, byte[] value) {
            AbstractC6118n.m27187e(value, "value");
            m33003J(i7, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p026D0.InterfaceC0178i
        /* JADX INFO: renamed from: m0 */
        public void mo910m0(int i7) {
            m33003J(i7, null);
        }

        @Override // p026D0.InterfaceC0178i
        /* JADX INFO: renamed from: t */
        public void mo911t(int i7, String value) {
            AbstractC6118n.m27187e(value, "value");
            m33003J(i7, value);
        }

        @Override // p026D0.InterfaceC0180k
        /* JADX INFO: renamed from: y */
        public int mo913y() {
            return ((Number) m33007x(c.f29884a)).intValue();
        }
    }

    /* JADX INFO: renamed from: y0.d$c */
    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a */
        private final Cursor f29885a;

        /* JADX INFO: renamed from: b */
        private final C7448c f29886b;

        public c(Cursor delegate, C7448c autoCloser) {
            AbstractC6118n.m27187e(delegate, "delegate");
            AbstractC6118n.m27187e(autoCloser, "autoCloser");
            this.f29885a = delegate;
            this.f29886b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29885a.close();
            this.f29886b.m32986e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i7, CharArrayBuffer charArrayBuffer) {
            this.f29885a.copyStringToBuffer(i7, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f29885a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i7) {
            return this.f29885a.getBlob(i7);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f29885a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f29885a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f29885a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i7) {
            return this.f29885a.getColumnName(i7);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f29885a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f29885a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i7) {
            return this.f29885a.getDouble(i7);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f29885a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i7) {
            return this.f29885a.getFloat(i7);
        }

        @Override // android.database.Cursor
        public int getInt(int i7) {
            return this.f29885a.getInt(i7);
        }

        @Override // android.database.Cursor
        public long getLong(int i7) {
            return this.f29885a.getLong(i7);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C0172c.m872a(this.f29885a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return C0175f.m876a(this.f29885a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f29885a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i7) {
            return this.f29885a.getShort(i7);
        }

        @Override // android.database.Cursor
        public String getString(int i7) {
            return this.f29885a.getString(i7);
        }

        @Override // android.database.Cursor
        public int getType(int i7) {
            return this.f29885a.getType(i7);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f29885a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f29885a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f29885a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f29885a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f29885a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f29885a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i7) {
            return this.f29885a.isNull(i7);
        }

        @Override // android.database.Cursor
        public boolean move(int i7) {
            return this.f29885a.move(i7);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f29885a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f29885a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f29885a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i7) {
            return this.f29885a.moveToPosition(i7);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f29885a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f29885a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f29885a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f29885a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f29885a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            AbstractC6118n.m27187e(extras, "extras");
            C0174e.m875a(this.f29885a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f29885a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            AbstractC6118n.m27187e(cr, "cr");
            AbstractC6118n.m27187e(uris, "uris");
            C0175f.m877b(this.f29885a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f29885a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f29885a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C7449d(InterfaceC0177h delegate, C7448c autoCloser) {
        AbstractC6118n.m27187e(delegate, "delegate");
        AbstractC6118n.m27187e(autoCloser, "autoCloser");
        this.f29866a = delegate;
        this.f29867b = autoCloser;
        autoCloser.m32991k(mo32994d());
        this.f29868c = new a(autoCloser);
    }

    @Override // p026D0.InterfaceC0177h
    /* JADX INFO: renamed from: Y */
    public InterfaceC0176g mo892Y() {
        this.f29868c.m32995d();
        return this.f29868c;
    }

    @Override // p026D0.InterfaceC0177h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29868c.close();
    }

    @Override // p394y0.InterfaceC7452g
    /* JADX INFO: renamed from: d */
    public InterfaceC0177h mo32994d() {
        return this.f29866a;
    }

    @Override // p026D0.InterfaceC0177h
    public String getDatabaseName() {
        return this.f29866a.getDatabaseName();
    }

    @Override // p026D0.InterfaceC0177h
    public void setWriteAheadLoggingEnabled(boolean z7) {
        this.f29866a.setWriteAheadLoggingEnabled(z7);
    }
}
