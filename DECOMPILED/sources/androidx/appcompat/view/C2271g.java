package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.widget.AbstractC2315M;
import androidx.appcompat.widget.C2348d0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p057H.InterfaceMenuC0491a;
import p111O.AbstractC1035b;
import p111O.AbstractC1084y;
import p255h.AbstractC5529j;
import p295m.MenuItemC6316c;

/* JADX INFO: renamed from: androidx.appcompat.view.g */
/* JADX INFO: loaded from: classes.dex */
public class C2271g extends MenuInflater {

    /* JADX INFO: renamed from: e */
    static final Class[] f7523e;

    /* JADX INFO: renamed from: f */
    static final Class[] f7524f;

    /* JADX INFO: renamed from: a */
    final Object[] f7525a;

    /* JADX INFO: renamed from: b */
    final Object[] f7526b;

    /* JADX INFO: renamed from: c */
    Context f7527c;

    /* JADX INFO: renamed from: d */
    private Object f7528d;

    /* JADX INFO: renamed from: androidx.appcompat.view.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        private static final Class[] f7529c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        private Object f7530a;

        /* JADX INFO: renamed from: b */
        private Method f7531b;

        public a(Object obj, String str) {
            this.f7530a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7531b = cls.getMethod(str, f7529c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7531b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7531b.invoke(this.f7530a, menuItem)).booleanValue();
                }
                this.f7531b.invoke(this.f7530a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.g$b */
    private class b {

        /* JADX INFO: renamed from: A */
        AbstractC1035b f7532A;

        /* JADX INFO: renamed from: B */
        private CharSequence f7533B;

        /* JADX INFO: renamed from: C */
        private CharSequence f7534C;

        /* JADX INFO: renamed from: D */
        private ColorStateList f7535D = null;

        /* JADX INFO: renamed from: E */
        private PorterDuff.Mode f7536E = null;

        /* JADX INFO: renamed from: a */
        private Menu f7538a;

        /* JADX INFO: renamed from: b */
        private int f7539b;

        /* JADX INFO: renamed from: c */
        private int f7540c;

        /* JADX INFO: renamed from: d */
        private int f7541d;

        /* JADX INFO: renamed from: e */
        private int f7542e;

        /* JADX INFO: renamed from: f */
        private boolean f7543f;

        /* JADX INFO: renamed from: g */
        private boolean f7544g;

        /* JADX INFO: renamed from: h */
        private boolean f7545h;

        /* JADX INFO: renamed from: i */
        private int f7546i;

        /* JADX INFO: renamed from: j */
        private int f7547j;

        /* JADX INFO: renamed from: k */
        private CharSequence f7548k;

        /* JADX INFO: renamed from: l */
        private CharSequence f7549l;

        /* JADX INFO: renamed from: m */
        private int f7550m;

        /* JADX INFO: renamed from: n */
        private char f7551n;

        /* JADX INFO: renamed from: o */
        private int f7552o;

        /* JADX INFO: renamed from: p */
        private char f7553p;

        /* JADX INFO: renamed from: q */
        private int f7554q;

        /* JADX INFO: renamed from: r */
        private int f7555r;

        /* JADX INFO: renamed from: s */
        private boolean f7556s;

        /* JADX INFO: renamed from: t */
        private boolean f7557t;

        /* JADX INFO: renamed from: u */
        private boolean f7558u;

        /* JADX INFO: renamed from: v */
        private int f7559v;

        /* JADX INFO: renamed from: w */
        private int f7560w;

        /* JADX INFO: renamed from: x */
        private String f7561x;

        /* JADX INFO: renamed from: y */
        private String f7562y;

        /* JADX INFO: renamed from: z */
        private String f7563z;

        public b(Menu menu) {
            this.f7538a = menu;
            m9397h();
        }

        /* JADX INFO: renamed from: c */
        private char m9389c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: e */
        private Object m9390e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C2271g.this.f7527c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        /* JADX INFO: renamed from: i */
        private void m9391i(MenuItem menuItem) {
            boolean z7 = false;
            menuItem.setChecked(this.f7556s).setVisible(this.f7557t).setEnabled(this.f7558u).setCheckable(this.f7555r >= 1).setTitleCondensed(this.f7549l).setIcon(this.f7550m);
            int i7 = this.f7559v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f7563z != null) {
                if (C2271g.this.f7527c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C2271g.this.m9388b(), this.f7563z));
            }
            if (this.f7555r >= 2) {
                if (menuItem instanceof C2282g) {
                    ((C2282g) menuItem).m9563t(true);
                } else if (menuItem instanceof MenuItemC6316c) {
                    ((MenuItemC6316c) menuItem).m27259h(true);
                }
            }
            String str = this.f7561x;
            if (str != null) {
                menuItem.setActionView((View) m9390e(str, C2271g.f7523e, C2271g.this.f7525a));
                z7 = true;
            }
            int i8 = this.f7560w;
            if (i8 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC1035b abstractC1035b = this.f7532A;
            if (abstractC1035b != null) {
                AbstractC1084y.m4792a(menuItem, abstractC1035b);
            }
            AbstractC1084y.m4794c(menuItem, this.f7533B);
            AbstractC1084y.m4798g(menuItem, this.f7534C);
            AbstractC1084y.m4793b(menuItem, this.f7551n, this.f7552o);
            AbstractC1084y.m4797f(menuItem, this.f7553p, this.f7554q);
            PorterDuff.Mode mode = this.f7536E;
            if (mode != null) {
                AbstractC1084y.m4796e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f7535D;
            if (colorStateList != null) {
                AbstractC1084y.m4795d(menuItem, colorStateList);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m9392a() {
            this.f7545h = true;
            m9391i(this.f7538a.add(this.f7539b, this.f7546i, this.f7547j, this.f7548k));
        }

        /* JADX INFO: renamed from: b */
        public SubMenu m9393b() {
            this.f7545h = true;
            SubMenu subMenuAddSubMenu = this.f7538a.addSubMenu(this.f7539b, this.f7546i, this.f7547j, this.f7548k);
            m9391i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: d */
        public boolean m9394d() {
            return this.f7545h;
        }

        /* JADX INFO: renamed from: f */
        public void m9395f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C2271g.this.f7527c.obtainStyledAttributes(attributeSet, AbstractC5529j.f21297o1);
            this.f7539b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21307q1, 0);
            this.f7540c = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21317s1, 0);
            this.f7541d = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21322t1, 0);
            this.f7542e = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21327u1, 0);
            this.f7543f = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21312r1, true);
            this.f7544g = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21302p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: g */
        public void m9396g(AttributeSet attributeSet) {
            C2348d0 c2348d0M10024u = C2348d0.m10024u(C2271g.this.f7527c, attributeSet, AbstractC5529j.f21332v1);
            this.f7546i = c2348d0M10024u.m10039n(AbstractC5529j.f21347y1, 0);
            this.f7547j = (c2348d0M10024u.m10036k(AbstractC5529j.f21121B1, this.f7540c) & (-65536)) | (c2348d0M10024u.m10036k(AbstractC5529j.f21126C1, this.f7541d) & 65535);
            this.f7548k = c2348d0M10024u.m10041p(AbstractC5529j.f21131D1);
            this.f7549l = c2348d0M10024u.m10041p(AbstractC5529j.f21136E1);
            this.f7550m = c2348d0M10024u.m10039n(AbstractC5529j.f21337w1, 0);
            this.f7551n = m9389c(c2348d0M10024u.m10040o(AbstractC5529j.f21141F1));
            this.f7552o = c2348d0M10024u.m10036k(AbstractC5529j.f21171M1, 4096);
            this.f7553p = m9389c(c2348d0M10024u.m10040o(AbstractC5529j.f21146G1));
            this.f7554q = c2348d0M10024u.m10036k(AbstractC5529j.f21187Q1, 4096);
            int i7 = AbstractC5529j.f21151H1;
            if (c2348d0M10024u.m10044s(i7)) {
                this.f7555r = c2348d0M10024u.m10026a(i7, false) ? 1 : 0;
            } else {
                this.f7555r = this.f7542e;
            }
            this.f7556s = c2348d0M10024u.m10026a(AbstractC5529j.f21352z1, false);
            this.f7557t = c2348d0M10024u.m10026a(AbstractC5529j.f21116A1, this.f7543f);
            this.f7558u = c2348d0M10024u.m10026a(AbstractC5529j.f21342x1, this.f7544g);
            this.f7559v = c2348d0M10024u.m10036k(AbstractC5529j.f21191R1, -1);
            this.f7563z = c2348d0M10024u.m10040o(AbstractC5529j.f21155I1);
            this.f7560w = c2348d0M10024u.m10039n(AbstractC5529j.f21159J1, 0);
            this.f7561x = c2348d0M10024u.m10040o(AbstractC5529j.f21167L1);
            String strM10040o = c2348d0M10024u.m10040o(AbstractC5529j.f21163K1);
            this.f7562y = strM10040o;
            boolean z7 = strM10040o != null;
            if (z7 && this.f7560w == 0 && this.f7561x == null) {
                this.f7532A = (AbstractC1035b) m9390e(strM10040o, C2271g.f7524f, C2271g.this.f7526b);
            } else {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f7532A = null;
            }
            this.f7533B = c2348d0M10024u.m10041p(AbstractC5529j.f21175N1);
            this.f7534C = c2348d0M10024u.m10041p(AbstractC5529j.f21195S1);
            int i8 = AbstractC5529j.f21183P1;
            if (c2348d0M10024u.m10044s(i8)) {
                this.f7536E = AbstractC2315M.m9771e(c2348d0M10024u.m10036k(i8, -1), this.f7536E);
            } else {
                this.f7536E = null;
            }
            int i9 = AbstractC5529j.f21179O1;
            if (c2348d0M10024u.m10044s(i9)) {
                this.f7535D = c2348d0M10024u.m10028c(i9);
            } else {
                this.f7535D = null;
            }
            c2348d0M10024u.m10046x();
            this.f7545h = false;
        }

        /* JADX INFO: renamed from: h */
        public void m9397h() {
            this.f7539b = 0;
            this.f7540c = 0;
            this.f7541d = 0;
            this.f7542e = 0;
            this.f7543f = true;
            this.f7544g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f7523e = clsArr;
        f7524f = clsArr;
    }

    public C2271g(Context context) {
        super(context);
        this.f7527c = context;
        Object[] objArr = {context};
        this.f7525a = objArr;
        this.f7526b = objArr;
    }

    /* JADX INFO: renamed from: a */
    private Object m9386a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m9386a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: c */
    private void m9387c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str)) {
                        z8 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.m9397h();
                    } else if (name2.equals("item")) {
                        if (!bVar.m9394d()) {
                            AbstractC1035b abstractC1035b = bVar.f7532A;
                            if (abstractC1035b == null || !abstractC1035b.mo4610a()) {
                                bVar.m9392a();
                            } else {
                                bVar.m9393b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z7 = true;
                    }
                }
            } else if (!z8) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.m9395f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.m9396g(attributeSet);
                } else if (name3.equals("menu")) {
                    m9387c(xmlPullParser, attributeSet, bVar.m9393b());
                } else {
                    str = name3;
                    z8 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: b */
    Object m9388b() {
        if (this.f7528d == null) {
            this.f7528d = m9386a(this.f7527c);
        }
        return this.f7528d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0491a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z7 = false;
        try {
            try {
                layout = this.f7527c.getResources().getLayout(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C2280e) {
                    C2280e c2280e = (C2280e) menu;
                    if (c2280e.m9497H()) {
                        c2280e.m9528i0();
                        z7 = true;
                    }
                }
                m9387c(layout, attributeSetAsAttributeSet, menu);
                if (z7) {
                    ((C2280e) menu).m9527h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (z7) {
                ((C2280e) menu).m9527h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
