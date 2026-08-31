package p002A0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0176g;
import p302m6.AbstractC6406h;
import p394y0.EnumC7455j;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0007e {

    /* JADX INFO: renamed from: e */
    public static final b f14e = new b(null);

    /* JADX INFO: renamed from: a */
    public final String f15a;

    /* JADX INFO: renamed from: b */
    public final Map f16b;

    /* JADX INFO: renamed from: c */
    public final Set f17c;

    /* JADX INFO: renamed from: d */
    public final Set f18d;

    /* JADX INFO: renamed from: A0.e$a */
    public static final class a {

        /* JADX INFO: renamed from: h */
        public static final C7621a f19h = new C7621a(null);

        /* JADX INFO: renamed from: a */
        public final String f20a;

        /* JADX INFO: renamed from: b */
        public final String f21b;

        /* JADX INFO: renamed from: c */
        public final boolean f22c;

        /* JADX INFO: renamed from: d */
        public final int f23d;

        /* JADX INFO: renamed from: e */
        public final String f24e;

        /* JADX INFO: renamed from: f */
        public final int f25f;

        /* JADX INFO: renamed from: g */
        public final int f26g;

        /* JADX INFO: renamed from: A0.e$a$a, reason: collision with other inner class name */
        public static final class C7621a {
            public /* synthetic */ C7621a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            private final boolean m12a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < str.length()) {
                    char cCharAt = str.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i8++;
                    } else if (cCharAt == ')' && (i8 = i8 - 1) == 0 && i9 != str.length() - 1) {
                        return false;
                    }
                    i7++;
                    i9 = i10;
                }
                return i8 == 0;
            }

            /* JADX INFO: renamed from: b */
            public final boolean m13b(String current, String str) {
                AbstractC6118n.m27187e(current, "current");
                if (AbstractC6118n.m27183a(current, str)) {
                    return true;
                }
                if (!m12a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return AbstractC6118n.m27183a(AbstractC6406h.m27594S0(strSubstring).toString(), str);
            }

            private C7621a() {
            }
        }

        public a(String name, String type, boolean z7, int i7, String str, int i8) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(type, "type");
            this.f20a = name;
            this.f21b = type;
            this.f22c = z7;
            this.f23d = i7;
            this.f24e = str;
            this.f25f = i8;
            this.f26g = m11a(type);
        }

        /* JADX INFO: renamed from: a */
        private final int m11a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            AbstractC6118n.m27186d(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC6118n.m27186d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (AbstractC6406h.m27589Q(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (AbstractC6406h.m27589Q(upperCase, "CHAR", false, 2, null) || AbstractC6406h.m27589Q(upperCase, "CLOB", false, 2, null) || AbstractC6406h.m27589Q(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (AbstractC6406h.m27589Q(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (AbstractC6406h.m27589Q(upperCase, "REAL", false, 2, null) || AbstractC6406h.m27589Q(upperCase, "FLOA", false, 2, null) || AbstractC6406h.m27589Q(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f23d != ((a) obj).f23d) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC6118n.m27183a(this.f20a, aVar.f20a) || this.f22c != aVar.f22c) {
                return false;
            }
            if (this.f25f == 1 && aVar.f25f == 2 && (str3 = this.f24e) != null && !f19h.m13b(str3, aVar.f24e)) {
                return false;
            }
            if (this.f25f == 2 && aVar.f25f == 1 && (str2 = aVar.f24e) != null && !f19h.m13b(str2, this.f24e)) {
                return false;
            }
            int i7 = this.f25f;
            return (i7 == 0 || i7 != aVar.f25f || ((str = this.f24e) == null ? aVar.f24e == null : f19h.m13b(str, aVar.f24e))) && this.f26g == aVar.f26g;
        }

        public int hashCode() {
            return (((((this.f20a.hashCode() * 31) + this.f26g) * 31) + (this.f22c ? 1231 : 1237)) * 31) + this.f23d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f20a);
            sb.append("', type='");
            sb.append(this.f21b);
            sb.append("', affinity='");
            sb.append(this.f26g);
            sb.append("', notNull=");
            sb.append(this.f22c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f23d);
            sb.append(", defaultValue='");
            String str = this.f24e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: A0.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0007e m14a(InterfaceC0176g database, String tableName) {
            AbstractC6118n.m27187e(database, "database");
            AbstractC6118n.m27187e(tableName, "tableName");
            return AbstractC0008f.m24f(database, tableName);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: A0.e$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f27a;

        /* JADX INFO: renamed from: b */
        public final String f28b;

        /* JADX INFO: renamed from: c */
        public final String f29c;

        /* JADX INFO: renamed from: d */
        public final List f30d;

        /* JADX INFO: renamed from: e */
        public final List f31e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            AbstractC6118n.m27187e(referenceTable, "referenceTable");
            AbstractC6118n.m27187e(onDelete, "onDelete");
            AbstractC6118n.m27187e(onUpdate, "onUpdate");
            AbstractC6118n.m27187e(columnNames, "columnNames");
            AbstractC6118n.m27187e(referenceColumnNames, "referenceColumnNames");
            this.f27a = referenceTable;
            this.f28b = onDelete;
            this.f29c = onUpdate;
            this.f30d = columnNames;
            this.f31e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC6118n.m27183a(this.f27a, cVar.f27a) && AbstractC6118n.m27183a(this.f28b, cVar.f28b) && AbstractC6118n.m27183a(this.f29c, cVar.f29c) && AbstractC6118n.m27183a(this.f30d, cVar.f30d)) {
                return AbstractC6118n.m27183a(this.f31e, cVar.f31e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27a.hashCode() * 31) + this.f28b.hashCode()) * 31) + this.f29c.hashCode()) * 31) + this.f30d.hashCode()) * 31) + this.f31e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27a + "', onDelete='" + this.f28b + " +', onUpdate='" + this.f29c + "', columnNames=" + this.f30d + ", referenceColumnNames=" + this.f31e + '}';
        }
    }

    /* JADX INFO: renamed from: A0.e$d */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a */
        private final int f32a;

        /* JADX INFO: renamed from: b */
        private final int f33b;

        /* JADX INFO: renamed from: c */
        private final String f34c;

        /* JADX INFO: renamed from: d */
        private final String f35d;

        public d(int i7, int i8, String from, String to) {
            AbstractC6118n.m27187e(from, "from");
            AbstractC6118n.m27187e(to, "to");
            this.f32a = i7;
            this.f33b = i8;
            this.f34c = from;
            this.f35d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            AbstractC6118n.m27187e(other, "other");
            int i7 = this.f32a - other.f32a;
            return i7 == 0 ? this.f33b - other.f33b : i7;
        }

        /* JADX INFO: renamed from: d */
        public final String m16d() {
            return this.f34c;
        }

        /* JADX INFO: renamed from: h */
        public final int m17h() {
            return this.f32a;
        }

        /* JADX INFO: renamed from: j */
        public final String m18j() {
            return this.f35d;
        }
    }

    public C0007e(String name, Map columns, Set foreignKeys, Set set) {
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(columns, "columns");
        AbstractC6118n.m27187e(foreignKeys, "foreignKeys");
        this.f15a = name;
        this.f16b = columns;
        this.f17c = foreignKeys;
        this.f18d = set;
    }

    /* JADX INFO: renamed from: a */
    public static final C0007e m10a(InterfaceC0176g interfaceC0176g, String str) {
        return f14e.m14a(interfaceC0176g, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007e)) {
            return false;
        }
        C0007e c0007e = (C0007e) obj;
        if (!AbstractC6118n.m27183a(this.f15a, c0007e.f15a) || !AbstractC6118n.m27183a(this.f16b, c0007e.f16b) || !AbstractC6118n.m27183a(this.f17c, c0007e.f17c)) {
            return false;
        }
        Set set2 = this.f18d;
        if (set2 == null || (set = c0007e.f18d) == null) {
            return true;
        }
        return AbstractC6118n.m27183a(set2, set);
    }

    public int hashCode() {
        return (((this.f15a.hashCode() * 31) + this.f16b.hashCode()) * 31) + this.f17c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f15a + "', columns=" + this.f16b + ", foreignKeys=" + this.f17c + ", indices=" + this.f18d + '}';
    }

    /* JADX INFO: renamed from: A0.e$e */
    public static final class e {

        /* JADX INFO: renamed from: e */
        public static final a f36e = new a(null);

        /* JADX INFO: renamed from: a */
        public final String f37a;

        /* JADX INFO: renamed from: b */
        public final boolean f38b;

        /* JADX INFO: renamed from: c */
        public final List f39c;

        /* JADX INFO: renamed from: d */
        public List f40d;

        /* JADX INFO: renamed from: A0.e$e$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public e(String name, boolean z7, List columns, List orders) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(columns, "columns");
            AbstractC6118n.m27187e(orders, "orders");
            this.f37a = name;
            this.f38b = z7;
            this.f39c = columns;
            this.f40d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    orders.add(EnumC7455j.ASC.name());
                }
            }
            this.f40d = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f38b == eVar.f38b && AbstractC6118n.m27183a(this.f39c, eVar.f39c) && AbstractC6118n.m27183a(this.f40d, eVar.f40d)) {
                return AbstractC6406h.m27557K(this.f37a, "index_", false, 2, null) ? AbstractC6406h.m27557K(eVar.f37a, "index_", false, 2, null) : AbstractC6118n.m27183a(this.f37a, eVar.f37a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((AbstractC6406h.m27557K(this.f37a, "index_", false, 2, null) ? -1184239155 : this.f37a.hashCode()) * 31) + (this.f38b ? 1 : 0)) * 31) + this.f39c.hashCode()) * 31) + this.f40d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f37a + "', unique=" + this.f38b + ", columns=" + this.f39c + ", orders=" + this.f40d + "'}";
        }

        public e(String name, boolean z7, List columns) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(EnumC7455j.ASC.name());
            }
            this(name, z7, columns, arrayList);
        }
    }
}
