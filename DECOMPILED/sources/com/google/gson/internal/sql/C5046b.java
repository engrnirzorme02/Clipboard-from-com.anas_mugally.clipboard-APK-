package com.google.gson.internal.sql;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5052m;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.sql.b */
/* JADX INFO: loaded from: classes.dex */
final class C5046b extends AbstractC5059s {

    /* JADX INFO: renamed from: b */
    static final InterfaceC5060t f19221b = new a();

    /* JADX INFO: renamed from: a */
    private final DateFormat f19222a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.b$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            a aVar = null;
            if (c5058a.m22814c() == Time.class) {
                return new C5046b(aVar);
            }
            return null;
        }
    }

    /* synthetic */ C5046b(a aVar) {
        this();
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time mo22636b(C7415a c7415a) throws IOException {
        Time time;
        if (c7415a.m32824d1() == EnumC7416b.NULL) {
            c7415a.m32821Z0();
            return null;
        }
        String strM32822b1 = c7415a.m32822b1();
        synchronized (this) {
            TimeZone timeZone = this.f19222a.getTimeZone();
            try {
                try {
                    time = new Time(this.f19222a.parse(strM32822b1).getTime());
                    this.f19222a.setTimeZone(timeZone);
                } catch (ParseException e7) {
                    throw new C5052m("Failed parsing '" + strM32822b1 + "' as SQL Time; at path " + c7415a.m32830p0(), e7);
                }
            } catch (Throwable th) {
                this.f19222a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Time time) throws IOException {
        String str;
        if (time == null) {
            c7417c.mo22681R0();
            return;
        }
        synchronized (this) {
            str = this.f19222a.format((Date) time);
        }
        c7417c.mo22687f1(str);
    }

    private C5046b() {
        this.f19222a = new SimpleDateFormat("hh:mm:ss a");
    }
}
