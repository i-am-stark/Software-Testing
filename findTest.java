
  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 0. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> empty </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> yes </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_0()
    {
    // properties = empty,fileExists,fileName,quoted

    // Given...
    //
    //   pattern.size = empty
    //
    //   pattern.quoted = yes
    //
    //   pattern.blanks = (not applicable)
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = (not applicable)
    //
    //   file.contents.patterns = (not applicable)
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 1. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> singleChar </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> no </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> none </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> one </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> none </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_1()
    {
    // properties = fileExists,fileName,matchable,singleChar

    // Given...
    //
    //   pattern.size = singleChar
    //
    //   pattern.quoted = no
    //
    //   pattern.blanks = none
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = one
    //
    //   file.contents.patterns = none
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 2. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> manyChars </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> yes </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> many </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> none </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> one </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> one </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_2()
    {
    // properties = fileExists,fileName,match,matchable,quoted

    // Given...
    //
    //   pattern.size = manyChars
    //
    //   pattern.quoted = yes
    //
    //   pattern.blanks = many
    //
    //   pattern.embeddedQuotes = none
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = many
    //
    //   file.contents.patterns = one
    //
    //   file.contents.patternsInLine = one
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 3. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> singleChar </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> yes </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> one </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> many </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_3()
    {
    // properties = fileExists,fileName,many,match,matchable,quoted,singleChar

    // Given...
    //
    //   pattern.size = singleChar
    //
    //   pattern.quoted = yes
    //
    //   pattern.blanks = one
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = many
    //
    //   file.contents.patterns = many
    //
    //   file.contents.patternsInLine = many
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 4. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> manyChars </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> no </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> none </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> one </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> one </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> one </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_4()
    {
    // properties = fileExists,fileName,match,matchable

    // Given...
    //
    //   pattern.size = manyChars
    //
    //   pattern.quoted = no
    //
    //   pattern.blanks = none
    //
    //   pattern.embeddedQuotes = one
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = many
    //
    //   file.contents.patterns = one
    //
    //   file.contents.patternsInLine = one
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 5. find (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> manyChars </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> yes </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> many </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> many </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> many </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> one </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_5()
    {
    // properties = fileExists,fileName,many,match,matchable,quoted

    // Given...
    //
    //   pattern.size = manyChars
    //
    //   pattern.quoted = yes
    //
    //   pattern.blanks = many
    //
    //   pattern.embeddedQuotes = many
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = many
    //
    //   file.contents.patterns = many
    //
    //   file.contents.patternsInLine = one
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 6. find (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> empty </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> <FONT color="red"> unterminated  </FONT> </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_6()
    {
    // properties = empty,fileExists,fileName

    // Given...
    //
    //   pattern.size = empty
    //
    //   pattern.quoted = unterminated
    //
    //   pattern.blanks = (not applicable)
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = (not applicable)
    //
    //   file.contents.patterns = (not applicable)
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 7. find (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> <FONT color="red"> missing  </FONT> </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_7()
    {
    // Given...
    //
    //   pattern.size = (not applicable)
    //
    //   pattern.quoted = (not applicable)
    //
    //   pattern.blanks = (not applicable)
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = missing
    //
    //   file.exists = (not applicable)
    //
    //   file.contents.linesLongerThanPattern = (not applicable)
    //
    //   file.contents.patterns = (not applicable)
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 8. find (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> <FONT color="red"> no  </FONT> </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_8()
    {
    // properties = fileName

    // Given...
    //
    //   pattern.size = (not applicable)
    //
    //   pattern.quoted = (not applicable)
    //
    //   pattern.blanks = (not applicable)
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = no
    //
    //   file.contents.linesLongerThanPattern = (not applicable)
    //
    //   file.contents.patterns = (not applicable)
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Examples#find find()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 9. find (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> pattern.size </TD> <TD> singleChar </TD> </TR>
   * <TR><TD> pattern.quoted </TD> <TD> no </TD> </TR>
   * <TR><TD> pattern.blanks </TD> <TD> none </TD> </TR>
   * <TR><TD> pattern.embeddedQuotes </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> fileName </TD> <TD> defined </TD> </TR>
   * <TR><TD> file.exists </TD> <TD> yes </TD> </TR>
   * <TR><TD> file.contents.linesLongerThanPattern </TD> <TD> <FONT color="red"> none  </FONT> </TD> </TR>
   * <TR><TD> file.contents.patterns </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> file.contents.patternsInLine </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void find_9()
    {
    // properties = fileExists,fileName,singleChar

    // Given...
    //
    //   pattern.size = singleChar
    //
    //   pattern.quoted = no
    //
    //   pattern.blanks = none
    //
    //   pattern.embeddedQuotes = (not applicable)
    //
    //   fileName = defined
    //
    //   file.exists = yes
    //
    //   file.contents.linesLongerThanPattern = none
    //
    //   file.contents.patterns = (not applicable)
    //
    //   file.contents.patternsInLine = (not applicable)
    
    // When...

    // Then...
    }
